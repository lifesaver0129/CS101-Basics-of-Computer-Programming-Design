package hm4;
import java.util.Scanner;
public class c {
	public static void main(String args[])
	{Scanner input=new Scanner(System.in);
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.printf("%d*%d = %d  ",j,i,i*j);
			}
			System.out.println();
		}
input.close();
	}
}
