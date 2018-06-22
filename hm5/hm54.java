package hm5;
import java.util.Random;
import java.util.Scanner;
public class hm54 
{
	public static void main(String args[])
	{
		Random guessthenumber = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("input 1 two times to start, input others to finish");
		int a=input.nextInt();
		while (a==1)
		{
			System.out.println( "input 1 to start, input others to finish"); 
			a=input.nextInt();
			if(a==1)
			{
				int face = 1 + guessthenumber.nextInt(1000);
				System.out.println( "please input your number"); 
				int b=input.nextInt();
				while(b!=face)
				{
					if(b>face)
				    {
						System.out.println( "Too high. Try again."); 
					    b=input.nextInt();
					}
				    if(b<face)
				    {
				    	System.out.println( "Too low. Try again.");
				        b=input.nextInt();
				    }
				    if (b==face)
				    System.out.println( "Congratulations"); 
				    }
				System.out.println( "input 1 to please again"); 
			    }
			else break;
			}
		input.close();
		}
	}

