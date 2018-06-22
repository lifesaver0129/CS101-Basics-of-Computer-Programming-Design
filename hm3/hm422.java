package hm3;
import java.util.Scanner;
public class hm422 
{
  public static void main( String[] args )
	{
	 double max,max2,a[];
	 a = new double[10];
	 Scanner input= new Scanner(System.in);
	 System.out.printf( "please inter the number of units sold by salesmen" );
	 for(int i=0;i<10;i++)
		   a[i]=input.nextInt();
		   max=max2=a[0];
	       for(int i=1;i<10;i++)
			   {
				  if(a[i]>max)
					  max2=max;
					  max=a[i]; 
			   }
	 System.out.println("the largest number is "+ max ); 
	 System.out.println("the second largest number is "+ max2 ); 
	 input.close();
	} 
}
