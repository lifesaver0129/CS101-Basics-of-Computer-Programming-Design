package firsthalf;
import java.util.Scanner;
public class class5 {
	public static void main(String[] args){
		int a,b,c;
		@SuppressWarnings("resource")
		Scanner i =new Scanner(System.in);
		a=i.nextInt();
		b=i.nextInt();
		c=i.nextInt();
		if(a==b)
			if(b==c)
				System.out.println("a==b==c");
			else
				System.out.println("a==b!=c");
		else System.out.println("a!=b");
		
		if(a!=b)
			System.out.print("a!=b");
		else
			if(b!=c)
			System.out.print("b!=c");
		    else
			System.out.print("a=b=c");
		
		int k=1;
		while(k<4){
			System.out.print("欢迎南方科技大学新生");
			k++;
		}
	}

}
