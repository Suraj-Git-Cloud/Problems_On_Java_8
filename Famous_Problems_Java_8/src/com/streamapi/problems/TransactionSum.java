package com.streamapi.problems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionSum {
	
	
	public record Transaction(String name, String type, String currency,Double amount) {
	
	}
	
	
	public static void main(String[] args) {
	
	  List<Transaction> transactions = List.of(
              new Transaction("JP Morgan", "Credit", "JPY", 1000.0),
              new Transaction("Goldman Sachs", "Debit", "USD", 2500.5),
              new Transaction("HSBC", "Credit", "GBP", 3200.75),
              new Transaction("ICICI Bank", "Debit", "INR", 15000.0),
              new Transaction("HDFC Bank", "Credit", "INR", 8450.25),
              new Transaction("Axis Bank", "Debit", "INR", 4300.0),
              new Transaction("Barclays", "Debit", "EUR", 2750.8),
              new Transaction("Deutsche Bank", "Debit", "EUR", 1980.4),
              new Transaction("Citibank", "Credit", "USD", 9999.99),
              new Transaction("Bank of America", "Debit", "USD", 7200.6)
      );
	  
	  
	  Map<String, Double>  currencySumMap = 
			  transactions.stream().filter(tran -> tran != null)
			  .filter(tran -> tran.type().equals("Debit"))
			  .filter(tran -> tran.currency() != null)
			  .filter(tran -> tran.currency().matches("[A-Za-z]{3}"))			  
			  .collect(Collectors.groupingBy(Transaction :: currency, 
					  Collectors.summingDouble(Transaction:: amount)					  
				)); 	  
	  
		System.out.println("Currency Amount Map : "+currencySumMap);
	  
	}

}
