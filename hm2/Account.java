package hm2;

public class Account {
		double balance; 
		public Account( double initialBalance )
		   {
		         balance = initialBalance;
		   } 
		   public void debit( double amount )
		   {
		      balance = balance - amount;
		   } 
		   public double getBalance()
		   {
		return balance; 
           }
	}
