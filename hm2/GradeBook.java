package hm2;
public class GradeBook {
	private String courseName,instructorsName;
	public GradeBook( String Cname,String name )
	{
		courseName = Cname;
		instructorsName = name;
    }
	public void setcourseName( String Cname )
	   {
		courseName = Cname; 
	   } 
	public String getcourseName()
	   {
	      return courseName;
	   }
	public void setinstructorsName( String name )
	   {
		instructorsName = name; 
	   } 
	public String getinstructorsName()
	   {
	      return instructorsName;
	   }
	   
	public void displayMessage()
	   {
	      System.out.printf( "Welcome to the grade book for %s!\n" ,
	    		  courseName);
	      System.out.printf("This course is presented by %s\n", instructorsName) ;
	   } 
}
