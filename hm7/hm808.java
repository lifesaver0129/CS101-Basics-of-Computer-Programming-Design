package hm7;

public class hm808 
{
	private int month;
	private int day;
	private int year;
	public hm808 ( int theYear, int theMonth, int theDay )
	{
		if ( theMonth > 0 && theMonth <= 12 )
		month = theMonth; 
		else
		{
			throw new IllegalArgumentException( "month must be 1-12" );
		}
		if ( theYear > 0 && theYear <= 9999 )
			year = theYear; 
		else
		{
			throw new IllegalArgumentException( "year must more than 1" );
		}
	   day = checkday( theDay ); 
	   System.out.printf("Date object constructor for date %s\n", this );
	} 
	private int checkday( int testday )
	{
		int daysinmonth[]={0,31,29,31,30,31,30,31,31,30,31,30,31};
	    if (testday > 0 && testday <= daysinmonth[month]) 
	       return testday;
	    else 
		    return 1;
    } 
	public void nextday()
	{
		int testday =day + 1;
		if (checkday(testday)==testday)
			day=testday;
		else
		{
			day=1;
			nextmonth();
		}
	}
	public void nextmonth()
	{
		if(12==month)
			year++;
		month=month%12+1;
	}
	public String show()
	{
		return month+"/"+day+"/"+year;
	}
}
