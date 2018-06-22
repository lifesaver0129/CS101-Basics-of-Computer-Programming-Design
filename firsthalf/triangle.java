package firsthalf;
import java.util.Scanner;
public class triangle {
	static int sideA;
	static int sideB;
	static int sideC;
	int height;
	public void perimeter(){
		int perimeter;
		perimeter = sideA + sideB +sideC;
		System.out.println("perimeter="+perimeter);
	}
	public int area(){
		int area;
		area=1/2 * height * sideA;
		System.out.println("area="+area);
		return area;
	}
	public void judge(){
		if (sideA == sideB && sideB == sideC && sideA == sideC)
		{System.out.print("This triangle is an isosceles trangle");}
		else
		{System.out.print("This triangle is a regular trangle");}
	}
	public static void main(String args[]){
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter sideA: " );
		sideA = input.nextInt(); 
		System.out.print( "Enter sideB: " );
		sideB = input.nextInt(); 
		System.out.print( "Enter sideC: " );
		sideC = input.nextInt(); 
	triangle triangle1 = new triangle();
	triangle1.perimeter();
	triangle1.area();
	triangle1.judge();
	input.close();
	}
}
