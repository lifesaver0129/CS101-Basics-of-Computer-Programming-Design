package firsthalf;
import java.util.Scanner;
public class class7 {
	public static void main(String[] args) 
	{
		int week;
		String weekInEnglish="";
		Scanner input = new Scanner(System.in);
		week = input.nextInt();
		switch(week)
		{
		case 1:weekInEnglish = "Monday";break;
		case 2:weekInEnglish = "Tuesday";break;
		case 3:weekInEnglish = "Wednesday";break;
		case 4:weekInEnglish = "Thursday";break;
		case 5:weekInEnglish = "Friday";break;
		case 6:weekInEnglish = "Saturday";break;
		case 7:weekInEnglish = "Sunday";break;
		}		
		System.out.println("The day is:"+weekInEnglish);
	
		input.close();
	}

}
