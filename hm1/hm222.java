package hm1;
import java.util.Scanner;
public class hm222 {
	public static void main( String[] args )
	 {
	Scanner input = new Scanner( System.in );
	int r; 
	int diameter; 
	int circumference;
	int area;
	System.out.print( "Enter r: " );
	r = input.nextInt();
     diameter = 2 * r;
     circumference = (int) (6.28318 * r);
	 area = (int) (3.14159 * r * r);
     System.out.printf( "Diameter is %d\n", diameter );
	 System.out.printf( "Circumference is %d\n", circumference );
	 System.out.printf( "Area is %d\n", area );
	 input.close();
}
}
