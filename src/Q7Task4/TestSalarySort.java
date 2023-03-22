package Q7Task4;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestSalarySort 
{
	Set<Employee>s2=new TreeSet<>(new SalarySort());
	public void addEmployee()
	{
		Employee e1=new Employee();
		e1.setId(25);
		e1.setName("UVW");
		e1.setSalary(98000);
		
		Employee e2=new Employee();
		e2.setId(85);
		e2.setName("MNO");
		e2.setSalary(45000);
		
		Employee e3=new Employee();
		e3.setId(65);
		e3.setName("DEF");
		e3.setSalary(36000);
		
		s2.add(e1);
		s2.add(e2);
		s2.add(e3);
	}
	public void viewEmployee()
	{
		for(Employee e:s2)
		{
			System.out.println("Name of a Employee="+" "+e.getName());
			System.out.println("Id of a Employee="+" "+e.getId());
			System.out.println("Salary of a Employee="+" "+e.getSalary());
		}
	}
		public static void main(String args[])
		{
			 TestSalarySort  t=new  TestSalarySort ();
			Scanner sc=new Scanner(System.in);
			loop:while(true)
			{
				System.out.println("Enter Case of Your Choice");
			int c=sc.nextInt();
			System.out.println("Add Employee Data");
			System.out.println("View Employee Data");
		
			switch(c)
			{
			case 1:
	            t.addEmployee();
				break;
				
			case 2:
				t.viewEmployee();
				break loop;
			}
				
			}
		
		}
}


