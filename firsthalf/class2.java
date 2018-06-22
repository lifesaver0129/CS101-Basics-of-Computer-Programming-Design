package firsthalf;
import java.util.Scanner;
public class class2 {
	public static void main( String[] args )
	{
	Scanner input = new Scanner( System.in );
	int number1; 
	int number2;
	int sum;
	int difference;
	System.out.print( "Enter first integer: " );
	number1 = input.nextInt();
	System.out.print( "Enter second integer: " ); 
	number2 = input.nextInt(); 
     sum = number1 + number2; 
     difference = (1/number1 + 1) ^ number1 ;
	 System.out.printf( "Sum is %d\n", sum );
	 System.out.printf( "Difference is %d\n", difference );
	 input.close();
	}
}
