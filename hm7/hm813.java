package hm7;

public class hm813 
{
			private int day, month, year;
			private String[] monthnames = {"January","February","March","April","May","June","July","August","September","October","November","December"};
			private int monthday []= {31,28,31,30,31,30,31,31,30,31,30,31};
			public hm813()
			{
				day = 21;
				month = 12;
				year = 2015;
			}
			public hm813 (int mm,int dd,int yyyy)
			{
				setMonth(mm);
				setDay(dd);
				setYear(yyyy);
			}
			public hm813 (String mm, int dd, int yyyy)
			{	
				convertmonthname(mm);
				setDay (dd);
				setYear(yyyy);
			}
			public hm813 (int ddd,int yyyy)
			{
				setalltheday(ddd);
				setYear(yyyy);
			}
			public void setDay(int dd)
			{
				if(dd>=1&&dd<=12)
				{
				day=dd;
				}
				else{
				day = 1;
				}
			}
			public void setMonth(int mm)
			{
				if(mm>=1&&mm<=12)
				{
				month = mm;
				}
				else{
				month = 1;
				}
			}
			public void setYear (int yyyy)
			{
				if(yyyy>=1000&&yyyy<=9999)
				{
				year = yyyy;
				}
				else{
				year = 2016;
				}
			}
			public String toshow()
			{
				return month +" "+day+" "+year;
			}
			public String toshow2()
			{
				return monthnames[month-1]+" "+day+" "+year;
			}
			public String toshow3()
			{
				return day+" "+year;
			}
			public int daysOfMonth()
			{
				if(leapYear()&&month == 2)
				{
					return 29;
				}
				else{
					return monthday[month - 1];
				}
			}
			public boolean leapYear ()
			{
				if (year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0))
					return true;
				else
					return false;
			}
			public void setalltheday(int ddd)
			{
				int allday = 0;
				if (ddd<1 || ddd >366)
					ddd = 1;
				setMonth (1);
				for (int m=1;m<=12&&(allday + daysOfMonth())<ddd; ++m)
				{
					allday +=daysOfMonth();
					setMonth(m+1);
				}
				setDay(ddd-allday);
				day=ddd-allday;
			}
			
			public void convertmonthname (String monthname1)
			{
				boolean a = false;
				for (int i = 0;i<12;i++)
					if (monthname1.equals(monthnames[i]))
					{
						setMonth (i+1);
						a = true ;
						break;
					}
				if(!a)
					setMonth(1);
			}
		}