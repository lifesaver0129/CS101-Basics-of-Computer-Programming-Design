package secondhalf;

import java.util.Scanner;

//import java.util.Scanner;
public class class083 
{
    public static void main(String[] args) 
    {
	    String a;
	    System.out.print("input:");
	    Scanner input=new Scanner(System.in);
	    a=input.next(); 						
	    System.out.println(a+"\npassed");
	    System.out.println(a+="\npassed");
	    System.out.println(a);
	    input.close();
    }
}
