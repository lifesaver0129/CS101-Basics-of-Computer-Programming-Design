package secondhalf;

import java.util.ArrayList;

//import java.util.ArrayList;

public class class11 
{
	public static void main(String args[])
	{
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("apple");
		color.add("purple");
		System.out.println("red at "+color.indexOf("red"));
		System.out.println("apple at "+color.indexOf("apple"));
		System.out.println("purple at "+color.indexOf("purple"));
		
		color.remove(color.indexOf("apple"));
		
		for(String s:color)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println("red at "+color.indexOf("red"));
		System.out.println("purple at "+color.indexOf("purple"));
		
		color.add(1,"blue");
		
		for(String s:color)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		
		color.add("black");
		
		for(int i=0;i<color.size();i++)
		{
			System.out.print(color.get(i)+" ");
		}
		System.out.println();
	}
	
	
	
}
