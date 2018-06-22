package hm7;

public class hm808test 
{
	public static void main(String args[])
	{
		System.out.println("Check");
		hm808 testdate=new hm808(1997,1,29);
		for (int counter=0;counter<100;counter++)
		{
			testdate.nextday();
			System.out.println("incremented date:"+testdate.show());
		}
	}

}
