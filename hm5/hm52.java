package hm5;
import java.util.Scanner;
public class hm52 
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("please input the side");
		int a=input.nextInt();
		System.out.println("please input the fill charactor");
		String b=input.next();
		char c = b.charAt(0);
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
		input.close();
	}

}
