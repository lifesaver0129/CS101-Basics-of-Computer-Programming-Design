package secondhalf;

public class class13test 
{
	public static void main(String[] args) 
	{
		for(class13 course:class13.values())
		{
		System.out.printf("%s: Courese name is %s, learn in term %d\n", course,course.getName(), course.getTerm());
		}
	}

}
