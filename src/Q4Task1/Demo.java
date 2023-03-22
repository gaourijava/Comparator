package Q4Task1;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo
{
	//customized sorting order
	public static void main(String[] args) {
		//need to implement comparator interface because customized 	sorting
			TreeSet<String> t=new TreeSet<String>(new MyComparator());
			t.add("A");
			t.add("Z");
			t.add("B");
			t.add("A");
			System.out.println(t);              //descending order
	}
	}
