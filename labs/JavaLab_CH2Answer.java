package CH2;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*1*/
		System.out.printf("%s\n%d\n","Welcome Lab",2);
		System.out.println("\"**\"");
		System.out.println("*\t*");
		/*2*/
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		System.out.printf("num=%d", num);
		/*3*/				
		System.out.printf("\n%s\n", (num%2==0)?"even":"odd");
		/*4*/
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.printf("num1=%d与num2=%d比较,%s", num1,num2,(num1>num2)?"num1>num2":"num1<num2");		
		/*5*/	
	    num1=10;
	    num2=15;
		System.out.printf("\nnum1+num2=%d\nnum1-num2=%d", num1+num2,num1-num2);	   
		/*6*/	
		System.out.printf("\nnum1*num2=%d\nnum1/num2=%d\nnum1%%num2=%d", 
				num1*num2,num1/num2,num1%num2);	   		
		/*7*/	
		System.out.printf("\nnum1=%d与num2=%d比较,%s", num1,num2,(num1==num2)?"相等":"不等");		
		/*8*/		
		int num3=input.nextInt();
		if((num1==num2)&&(num1==num3)&&(num2==num3))
			System.out.printf("\nnum1=%d与num2=%d与num3=%d比较,%s",num1,num2,num3,"相等");
		else
			System.out.printf("\nnum1=%d与num2=%d与num3=%d比较,%s",num1,num2,num3,"不相等");
		/*9*/	
		System.out.printf("\n正方形周长为%d", num1*4);	
		/*10*/	
		System.out.print("\n班级\t姓名\t学号\tQQ\tTel\n");
		System.out.print("\n28\t姓名\t11519999\t12345678\t12345678987\n");		
		
	}

}
