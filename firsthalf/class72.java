package firsthalf;
import java.util.Scanner;
public class class72 
{
	public static int NumberDays(int month)
	{
	   int number;
	   switch(month)
	    {
	     case 2:
		 number=28;break;
	     case 4:
		 number=30;break;
	     case 6:
		 number=30;break;
	     case 9:
		 number=30;break;
	     case 11:
		 number=30;break;
		 default:
		 number=31;break;
	   }
	   return number;
    }
	public static void main(String args[])
	{
		int month=0; 
		int SumOfDay=0;
		Scanner input = new Scanner(System.in);
		while(month<=0||month>12)
		{
			System.out.println("Input a month:");
			month = input.nextInt();
		}
		for(int count=1;count<month;count++)
		{
			SumOfDay= SumOfDay+NumberDays(count);
		}
		System.out.printf("There are %d days before this month",SumOfDay);
		input.close();
	}
}