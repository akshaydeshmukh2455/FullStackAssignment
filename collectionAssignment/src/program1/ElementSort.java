package program1;

import java.util.Comparator;

public class ElementSort implements Comparator<Student>
{

	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.rollno-b.rollno;
	}

}
