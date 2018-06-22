package hm4;

import java.util.Scanner;

public class f 
{
	public static void main(String arg[])
	{
		
		Scanner input= new Scanner(System.in);
		System.out.println( "please inter how many number you want to inter" );
		double a[],n,ave,sum = 0,max=0;
	    int i=1;
		n=input.nextDouble();
		a = new double[9999999];
		do {
			a[i]=input.nextDouble();
			sum=a[i]+sum;
			if (a[i]>max)
			{
				max=a[i];
			}
			i++;
			}
		while(i<=n);
		ave=sum/n;
		System.out.println("the biggest number is "+ max);
		System.out.println("the average of numbers is "+ ave);
		input.close();
	}
}
