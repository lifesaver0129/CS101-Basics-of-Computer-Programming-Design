package hm2;
public class Employee {
    String firstname,lastname;
    double monthlysalary;
	public Employee( String fn,String ln, double ms )
	{
		firstname = fn;
		lastname = ln;
		monthlysalary = ms;
    }
	public void setfirstname( String fn )
	   {
		firstname = fn;
	   } 
	public String getfirstname()
	   {
	      return firstname;
	   }
	public void setlastname( String ln )
	   {
		lastname = ln;
	   } 
	public String getlastname()
	   {
	      return lastname;
	   }
	public void setmonthsalary( double ms )
	   {
		monthlysalary = ms;
	   } 
	public double getmonthsalary()
	   {
	      return monthlysalary;
	   }
	public void display()
	   {
	      System.out.println (firstname + "\t"+ lastname +"\t" + monthlysalary);
	   } 
}