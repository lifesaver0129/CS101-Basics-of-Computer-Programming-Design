package hm6;

public class hm715 
{
	public static double product(double... numbers)
	{
		double product = 1;
		for (double a : numbers)
	{
		product=product*a;
	}
	    return product;
	}
		public static void main (String []args)
		{
if ( args.length != 10 )
   System.out.println(
      "Error: Please re-enter the entire command, including\n" +
      "an array size, initial value and increment." );
else{
			int a =1,b=3,c=5,d=7,e=9;
			System.out.printf("a = %d,b= %d,c= %d,d= %d,e= %d",a,b,c,d,e);
			System.out.printf("a*b is: %d\n", product(a,b));
			System.out.printf("a*b*c is: %d\n", product(a,b,c));
			System.out.printf("a*b*c*d is: %d\n", product(a,b,c,d));
			System.out.printf("a*b*c*d*e is: %d\n", product(a,b,c,d,e));

		}
	}
}


