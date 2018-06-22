package hm7;

public class hm811test 
{
	public static void main(String args[])
	{
		hm811 a=new hm811(1.5,4.8);
		hm811 b=new hm811(8.4,5.1);
		System.out.printf("a=%s",a.toString());
		System.out.println();
		System.out.printf("b=%s",b.toString());
		System.out.println();
		System.out.printf("a+b=%s",a.add(b).toString());
		System.out.println();
		System.out.printf("a-b=%s",a.minus(b).toString());
	}

}
