package hm6;
import java.util.Scanner;
public class hm712 
{
	public static void main (String args[])
	{
		 int a = 0;
		 int Number;
		 int Array[] = new int[5];
		 Scanner input = new Scanner (System.in);
		 for(int counter=1;counter<=5;counter++)
		 {
			 System.out.println("Enter number "+counter+":");
			 Number=input.nextInt();
		 if (Number<10||Number>100)
		 {
			 System.out.println("Invalid range ");
			 continue;
		 }
		 else{
			 Array[a]=Number;
		     a++;
		     }
		 System.out.println("Numbers are as follows.");
		 for(int i=0;i<a;i++)
			{
			 System.out.println(Array[i]);
		    }
	      }
		 input.close();
	  }
}
