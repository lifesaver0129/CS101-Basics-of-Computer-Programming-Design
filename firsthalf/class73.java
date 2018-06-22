package firsthalf;
import java.util.Scanner;
public class class73 
{
	public static void main(String args[])
	{
		int number, price = 0, amount=0, quantity;
		Scanner input = new Scanner(System.in);
		System.out.println("put in the number 0 to start");
	    number=input.nextInt(); 
		while(number==0)
		{
		System.out.println("please input the number af your goods");
		number=input.nextInt();
		if(number ==0) break;
		switch(number)
		{
		case 1:price =2;break;
		case 2:price =4;break;
		case 3:price =9;break;
		case 4:price =5;break;
		case 5:price =6;break;
		}
		System.out.println("please input the quantity af your goods");
	    quantity=input.nextInt();
	    amount=amount+quantity*price;
	    System.out.println("if you are not finished,put in the number of next number");
	    System.out.println("if you are finished put in 0");
		}
	    System.out.println("the amount of your good is "+ amount);
		input.close();
	}
}
