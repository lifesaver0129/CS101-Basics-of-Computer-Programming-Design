package hm7;

public class hm811 
{
	private double real;
	private double imaginary;
	public hm811()
	{
		this(0.0,0.0);
	}
	public hm811(double r,double i)
	{
		real=r;
		imaginary=i;
	}
	public hm811 add(hm811 right)
	{
		return new hm811(real+right.real,imaginary+right.imaginary);
	}
	public hm811 minus(hm811 right)
	{
		return new hm811(real-right.real,imaginary-right.imaginary);
	}
	public String toString()
	{
		return String.format("%1f,%1f",real,imaginary);
	}
}
