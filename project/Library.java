package pro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;


public class Library
{
	private String booknumber,bookname,timeofputin,bookshelfnumber,state;
	private double bookprice;
	
	public static void save(ArrayList<Library> allthebook) throws IOException
	{
		File paper = new File("allthebook.txt");
		if(!paper.exists())
		{									
			paper.createNewFile();
		}
		BufferedWriter buffer1 = new BufferedWriter(new FileWriter(paper));
		for(Library book:allthebook)
		{
			buffer1.write(book.toString());
		}
		buffer1.close();
	}
	
	public static ArrayList<Library> read() throws IOException, ParseException
	{
		ArrayList<Library> allthebook = new ArrayList<Library>();
		File paper = new File("allthebook.txt");
		if(!paper.exists())
		{									
			paper.createNewFile();
			return allthebook;
		}
		String profile=null;
		Library book123 = null;
		BufferedReader buffer1 = new BufferedReader(new FileReader(paper));
		while((profile = buffer1.readLine())!=null)
		{
			book123 = new Library();
			book123.setbooknumber(profile);
			profile = buffer1.readLine();
			book123.setbookshelfnumber(profile);
			profile = buffer1.readLine();
			book123.setbookname(profile);
			profile = buffer1.readLine();
			book123.settimeofputin(profile);
			profile = buffer1.readLine();
			book123.setbookprice(Double.parseDouble(profile));
			profile = buffer1.readLine();
			book123.setstate(profile);
			allthebook.add(book123);
		}
		buffer1.close();
		return allthebook;
	}
	
	public Library() 
	{
		this.bookshelfnumber = "1";
		this.timeofputin = "2016-1-1";
		this.state = "在馆";
	}
	
	public void setbooknumber(String booknumber) 
	{
		this.booknumber = booknumber;
	}
	public String getbooknumber() 
	{
		return booknumber;
	}
	public void setbookname(String bookname) 
	{
		this.bookname = bookname;
	}
	public String getbookname() 
	{
		return bookname;
	}
	public void setbookprice(double bookprice) 
	{
		this.bookprice = bookprice;
	}
	public double getbookprice() 
	{
		return bookprice;
	}
	public void settimeofputin(String timeofputin) 
	{
		this.timeofputin = timeofputin;
	}
	public String gettimeofputin() 
	{
		return timeofputin;
	}
	public void setbookshelfnumber(String bookshelfnumber) 
	{
		this.bookshelfnumber = bookshelfnumber;
	}
	public String getbookshelfnumber() 
	{
		return bookshelfnumber;
	}
	public void setstate(String state) 
	{
		this.state = state;
	}
	public String getstate() 
	{
		return state;
	}
	
	public void display()
	{
		System.out.println("编号："+this.booknumber);
		System.out.println("书架编号："+this.bookshelfnumber);
		System.out.println("书名："+this.bookname);
		System.out.println("入馆时间："+this.timeofputin);
		System.out.println("单价："+this.bookprice);
		System.out.println("状态："+this.state);
	}
}
