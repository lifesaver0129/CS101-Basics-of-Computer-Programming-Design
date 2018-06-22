package hm3;
import java.util.Scanner;
public class hm434 
{
	public static void main(String arg[])
	{
		
		Scanner input= new Scanner(System.in);
	    double a = 1,b=1,c=1,x,top,counter=1;
	   
	    System.out.println("Please write the number of terms： ");
	    top=input.nextInt();
	    x=top;
	    while ( counter <= top ) 
	    {
	    	a= a*counter;
	    	b= b+1/a;
	    	c= c+ Math.pow(x,counter)/a;
	    	//c= c+x^counter/a;
	         ++counter; 
	    }    
	    System.out.println("The number's factorial is "+ a);
	    System.out.println("The value of the mathematical constant e is "+ b);
	    System.out.println("The value of the e^x is "+ c);
	    input.close();
	}
}
