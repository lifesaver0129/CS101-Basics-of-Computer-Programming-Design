package hm4;
import java.util.Scanner;
public class b {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int a;
		do{
			a=input.nextInt();
		}while(a>=10);
		for(int i=1;i<=a;i++){
			for(int j=1;j<=i;j++){
				System.out.printf("*");
			}
			System.out.println();
		}
		input.close();
	}
}
