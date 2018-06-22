package hm4;

import java.util.Scanner;

public class a 
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		double a=2,b=0;
		while(b<=6){
			b=b+1/a;
			a++;
		}
		double c=a-1;
		System.out.println("the number of circulate is "+ c);
		input.close();
	}

}
