package hm4;

public class e 
{
	public static void main(String args[])
	{
		double a=1,b=0,i=1;
		while(b>=3.1419||b<=3.1410)
		{if(i%2==0)
			{b=-4/a+b;
			a=(a+2);
			i++;}
		else{
			b=4/a+b;
			a=(a+2);
			i++;
		}
		}
		System.out.println("the number of pi is "+b );
		System.out.println("the number of circulate is "+a );
	}

}
