package hm5;
import java.util.Random;
import java.util.Scanner;
public class hm53 
{
	public static void main(String args[])
	{
		Random TossCoin = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("input 1 two times to start, input others to finish");
		int a=input.nextInt();
		int face; 
		while (a==1)
		{
			System.out.println( "please input your number"); 
			a=input.nextInt();
			if(a==1)
			{
			face = 1 + TossCoin.nextInt( 2 );
			if(face ==1)
			System.out.println( "HEADS!"); 
			else
			System.out.println( "TAILS!"); 
			System.out.println("input 1 to start again, input others to finish");
			}
			else break;
		}
		input.close();
	}
}
