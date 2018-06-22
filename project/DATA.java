package pro;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DATA
{
	private String book;private int booknumber=0;private Date dayofborrow,dayofreturn;
	public static SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
	public static long EndDate = 14;				
	public void show()
	{
		Date list = new Date();
		System.out.println("书名："+book);
		System.out.println("借书日期："+formatter.format(dayofborrow));
		System.out.print("还书日期：");
		if(dayofreturn.getTime()==0)
		{
			System.out.print("目前尚未还书");
		}
		else
		{
			System.out.print(formatter.format(dayofreturn));
		}
		Date dateplus = new Date();
		dateplus.setTime(dayofborrow.getTime()+1000*60*60*24*EndDate);
		System.out.print("到期时间："+formatter.format(dateplus));
		list.setTime(list.getTime()-1000*60*60*24*EndDate);
		if(list.compareTo(dayofborrow)>0&&dayofreturn.getTime()==0)
		{
			System.out.println("逾期!");
		}
		else
		{
			System.out.println("未逾期!");
		}
	}
	
	public void setbooknumber(int booknumber) 
	{
		this.booknumber = booknumber;
	}
	public int getbooknumber() 
	{
		return booknumber;
	}
	public void setBook(String book) 
	{
		this.book = book;
	}
	public String getBook() 
	{
		return book;
	}
	public void setdayofborrow(Date dayofborrow) 
	{
		this.dayofborrow = dayofborrow;
	}
	public Date getdayofborrow() 
	{
		return dayofborrow;
	}
	public void setdayofreturn(Date dayofreturn) 
	{
		this.dayofreturn = dayofreturn;
	}
	public Date getdayofreturn() 
	{
		return dayofreturn;
	}
	public String toString() 
	{
		return book+"\n"+formatter.format(dayofborrow)+"\n"+formatter.format(dayofreturn)+"\n"+booknumber+"\r\n";
	}
	public DATA() 
	{
		dayofborrow = new Date();
		dayofreturn = new Date();
		dayofreturn.setTime(0);
	}

}
