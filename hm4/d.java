package hm4;

public class d 
{
	public static void main(String args[])
	{
		for(int a=100;a<=999;a++)
		{
			int b,c,d;
			b=a/100;
			c=(a-100*b)/10;
			d=(a-100*b-10*c);
			if(a==b*b*b+c*c*c+d*d*d)
			{
				System.out.println(a);
			}
		}
	}
}
