package Q6Task3;

import java.util.Scanner;

public class Test
{
	public static void main(String args[])
	{
		Collage c=new Collage();
		Scanner sc=new Scanner(System.in);
		loop:while(true)
		{
			System.out.println("Enter Your Choice Case");
			System.out.println("1:Add Student Data");
			System.out.println("2:View Student Data");
			System.out.println("Enter Case");
			int i=sc.nextInt();
			switch(i)
			{
			case 1:
				c.addStudent();
				break;
			case 2:
				c.viewStudent();
				break loop;
			}
		}
	}

}
