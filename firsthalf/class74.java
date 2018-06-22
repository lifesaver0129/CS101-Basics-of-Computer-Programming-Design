package firsthalf;
import java.util.Scanner;
public class class74 
{
	public static void main(String args[])
	{
		Scanner t=new Scanner(System.in);
		double a =t.nextDouble();
		int b=(int)t.nextDouble();
		double c=t.nextDouble();
		double d=t.nextDouble();
		double e=t.nextDouble();
		double result=Math.max(a,b);
		result=Math.max(result,c);
		System.out.print(result);
		System.out.print(Math.max(Math.max(Math.max(Math.max(a, b),c),d),e));
		t.close();
	}
}
