package Q5Task2;

import java.util.Comparator;

public class EmnameSort implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmname().compareTo(o2.getEmname());
	}
	

}
