package firsthalf;
import java.util.Scanner;
public class class5t {
	public static void main(String[] args) 
	{
	    Scanner input=new Scanner(System.in);
	    int n=1;
	         while(  n!=24      )
	         {
	           System.out.println("请输入1~100的整数：");
	           n=input.nextInt();
	         }
	        System.out.print("恭喜你回答正确！");
	       input.close();
	   }
	}