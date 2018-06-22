package hm3;
import java.util.Scanner;
public class hm418 {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int a,b,c,d;
		double earning;
		System.out.print( "Enter the item 1 you've sold: " );
		a = input.nextInt();
		System.out.print( "Enter the item 2 you've sold: " );
		b = input.nextInt();
		System.out.print( "Enter the item 3 you've sold: " );
		c = input.nextInt();
		System.out.print( "Enter the item 4 you've sold: " );
		d = input.nextInt();
		earning = 200 + 239.99*a*0.9 + 129.75*b*0.9 + 99.95*c*0.9 + 350.89*d*0.9;
		System.out.println("Your total earing is " + earning);
		input.close();
	}
}
