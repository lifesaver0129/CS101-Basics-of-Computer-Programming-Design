package hm5;
import java.util.Scanner;
public class hm51 
{
	public static void main(String args[])
	{
		int a,b,c=0,d;
		Scanner input = new Scanner(System.in);
		System.out.println("put in the number 0 to start");
	    a=input.nextInt(); 
		while(a==0)
		{
			System.out.println("please input the number of your staying hours");
			b=input.nextInt(); 
			if(b==0) break;
			if(b<=3)
			{
				System.out.println("your amount of charge is 2 dollar");
				c=c+2;
			}
			if(b>3&&b<=20)
			{
				b=b-3;
				d=3+b/2;
				c=c+d;
				System.out.println("your amount of charge is "+d+" dollar");
			}
			if(b>20)
			{
				System.out.println("your amount of charge is 10 dollar");
				c=c+10;
			}
			System.out.println("if you are not finished,put in the number of next number");
		    System.out.println("if you are finished input 0");
		}
		System.out.println("your amount of charge is "+c+" dollar");
		input.close();
	}
	
}
