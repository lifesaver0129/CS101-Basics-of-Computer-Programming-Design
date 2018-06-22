package hm2;

public class Employeetest {
	public static void main( String[] args )
		{
		Employee employee1 = new Employee ("Justin","HU",50000.0);
		if (employee1.monthlysalary < 0)
		{employee1.monthlysalary = 0;}
		Employee employee2 = new Employee ("Wanting","ZHANG",30000.0);		
		if (employee1.monthlysalary < 0)
		{employee1.monthlysalary = 0;}
		employee1.monthlysalary = 12 * employee1.monthlysalary;
		employee2.monthlysalary = 12 * employee2.monthlysalary;
		employee1.display(); 
		employee2.display(); 
		employee1.monthlysalary = 1.05 * employee1.monthlysalary;
		employee1.monthlysalary = 1.05 * employee1.monthlysalary;
		employee1.display(); 
		employee2.display(); 
		}
}
