package hm1;
import java.util.Scanner;
public class hm225 {
		public static void main( String[] args )
		 { 
		Scanner input = new Scanner( System.in );
		int number1; 
		int number2; 
		int number3;
		int number4;
		int number5;
		int no0 = 0 ,nop = 0, non = 0;
		System.out.print( "Enter first integer: " ); 
		number1 = input.nextInt(); 
		System.out.print( "Enter second integer: " ); 
		number2 = input.nextInt();
		System.out.print( "Enter third integer: " ); 
		number3 = input.nextInt();
		System.out.print( "Enter fourth integer: " ); 
		number4 = input.nextInt();
		System.out.print( "Enter fifth integer: " ); 
		number5 = input.nextInt();
		if (number1 == 0)
		{
			no0++;
		}else if (number1 >=0){
			nop++;
		}else{
			non++;
		}
		if (number2 == 0)
		{
			no0++;
		}else if (number2 >=0){
			nop++;
		}else{
			non++;
		}
		if (number3 == 0)
		{
			no0++;
		}else if (number3 >=0){
			nop++;
		}else{
			non++;
		}
		if (number4 == 0)
		{
			no0++;
		}else if (number4 >=0){
			nop++;
		}else{
			non++;
		}
		if (number5 == 0)
		{
			no0++;
		}else if (number5 >=0){
			nop++;
		}else{
			non++;
		}
		 System.out.printf( "the number of positive numbers is %d\n", nop );
		 System.out.printf( "the number of negative numbers is %d\n", non );
		 System.out.printf( "the number of zeros is %d\n", no0 );
		input.close();
		 }
	}
