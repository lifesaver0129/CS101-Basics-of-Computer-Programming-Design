package hm2;
import java.util.Scanner;
public class Accounttest {
	 public static void main( String[] args )
	{
		 Account account1 = new Account( 50.00 );
		 System.out.printf( "account1 balance: $%.2f\n",
				 account1.getBalance() );
		 Scanner input = new Scanner( System.in );
		 
		 System.out.print( "Enter debit for account1: " );
		 double debitAmount = input.nextDouble();
		 account1.balance = account1.balance - debitAmount;
		 System.out.printf( "\nminusing  ￼￼%.2f  to account1 balance\n\n",
				 debitAmount );
		 if (account1.balance < 0)
		 {System.out.print( "Debit amount exceeded account balance" ); }
		 else{System.out.printf( "account1 balance: $%.2f\n",
				 account1.getBalance() );}     
		 input.close();
	   } 
	}