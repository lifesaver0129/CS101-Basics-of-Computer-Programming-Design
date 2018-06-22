package hm1;
import java.util.Scanner;
public class hm213 {
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int number1; 
		int number2;
		int number3;
		int sum; 
		int product;
		int average;
		int largestnumber;
		int smallestnumber;
		System.out.print( "Enter first integer: " );
		number1 = input.nextInt();
		System.out.print( "Enter second integer: " ); 
		number2 = input.nextInt(); 
		System.out.print( "Enter third integer: " ); 
		number3 = input.nextInt(); 
	     sum = number1 + number2 + number3; 
	     product = number1 * number2 *number3;
		 average = sum / 3;
	     largestnumber = number1;
	     smallestnumber = number1;
		 if (number2 > largestnumber)
			 largestnumber = number2;
		 if (number3 > largestnumber)
			 largestnumber = number3;
		 if (number2 < smallestnumber)
			 smallestnumber = number2;
		 if (number3 < smallestnumber)
			 smallestnumber = number3;
		 System.out.printf( "Sum is %d\n", sum );
		 System.out.printf( "Product is %d\n", product );
		 System.out.printf( "Average is %d\n", average );
		 System.out.printf( "Largest number is %d\n", largestnumber);
		 System.out.printf( "Smallest number is %d\n", smallestnumber);
		 input.close();
		 

}
}