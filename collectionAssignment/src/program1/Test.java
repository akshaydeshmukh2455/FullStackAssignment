package program1;

import java.util.ArrayList;
import java.util.Collections;

public class Test 
{
	public static void main(String[] args) {
		ArrayList<Student> ar=new ArrayList<>();
		ar.add(new Student(1, "ram", "pune"));
		ar.add(new Student(10, "shiv", "pune"));
		ar.add(new Student(23, "gopal", "pune"));
		ar.add(new Student(4, "piyush", "pune"));
		
		System.out.println("Unsorted elements");
		
		for(int i=0;i<ar.size();i++)
		System.out.println(ar.get(i));
		Collections.sort(ar, new ElementSort());
		System.out.println("\nSorted by rollno");
		
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		
	}
}
