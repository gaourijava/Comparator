package Q5Task2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test 
{
	public static void main(String args[])
	{
		Set<Employee>e=null;
		
		Employee e1=new Employee();
		e1.setEmid(1);
		e1.setEmname("ABC");
		e1.setSalary(3000);
		
		Employee e2=new Employee();
		e2.setEmid(2);
		e2.setEmname("PQR");
		e2.setSalary(1000);
		
		Employee e3=new Employee();
		e3.setEmid(3);
		e3.setEmname("XYZ");
		e3.setSalary(5000);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Case");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			EmidSort i=new EmidSort();
			e=new TreeSet<>(i);
			break;
		case 2:
			EmnameSort nm=new EmnameSort();
			e=new TreeSet<>(nm);
			break;
		case 3:
			SalarySort ss=new SalarySort();
			e=new TreeSet<>(ss);
			break;
		}
		e.add(e1);
		e.add(e2);
		e.add(e3);
		for(Employee ee:e)
		{
			System.out.println("Name of a Employee="+" "+ee.getEmname());
			System.out.println("Id of a Employee="+" "+ee.getEmid());
			System.out.println("Salary of a Employee="+" "+ee.getSalary());
		}
		
	}

}
