package Q6Task3;

import java.util.Set;
import java.util.TreeSet;

public class Collage 
{
	Set<Student> s=new TreeSet<>(new RollnoSort());  
	
	public void addStudent()
	{
		
		Student s1=new Student();
		s1.setRollno(10);
		s1.setName("ABC");
		
		Student s2=new Student();
		s2.setRollno(50);
		s2.setName("XYZ");
		
		Student s3=new Student();
		s3.setRollno(25);
		s3.setName("MNO");
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
	}
	public void viewStudent()
	{
		
		for(Student a:s)
		{
			System.out.println("Name of Student="+" "+a.getName());
			System.out.println("Rollno of Student="+" "+a.getRollno());
			
		}
	}

}
