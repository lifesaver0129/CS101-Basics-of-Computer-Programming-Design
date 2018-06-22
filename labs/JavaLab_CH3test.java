package CH2;
class Student {
	String name;	
	long id;
	double javaScore;	
	double FinalScore;
	double TotalScore;
	
	public Student(){}
	public Student(String n,long i,
			double j,double f,double t)
	{	name=n;	id=i;	
	javaScore=j;
		FinalScore=f;	
		TotalScore=t;	}	

	void display(){
		System.out.println
		(name+"\t"+id+"\t"+
				javaScore+"\t"+FinalScore
				+"\t"+TotalScore);		
	}
}

public class Test {
	public static void main(String args[]){
		Student s1=new Student();		
		Student s2=new Student("Tom",11510222,56,45,45);
		s1.name="Jack";
		s1.id=11510123;
		s1.javaScore=99;
		s1.FinalScore=80;
		s1.TotalScore=92;		
		System.out.println
		("name\tID\tjavaScore\tFinalScore\tTotalScore");
		s1.display();
		s2.display();
		
		/*
		System.out.print(s1.name+"\t"+s1.id+"\t"+
				s1.javaScore+"\t"+s1.FinalScore
				+"\t"+s1.TotalScore);*/
	}

}









