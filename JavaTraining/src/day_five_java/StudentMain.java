package day_five_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
		List<Student> StudentList = new ArrayList<Student>();
		System.out.println("iterate using for-each loop");
		StudentList.add(new Student(1, "Bhuvana", 16));
		StudentList.add(new Student(7, "Zara", 15));
		StudentList.add(new Student(3, "Shilpa", 14));
		StudentList.add(new Student(5, "Asha", 17));
		StudentList.add(new Student(8, "Shilpa", 13));
		
		Iterator<Student> it = StudentList.iterator();
		
		System.out.println("Before sorting on ids: " + StudentList);
		//IDComparator comp = new IDComparator();
		NameComparator comp = new NameComparator();
		//AgeComparator comp = new AgeComparator();
		Collections.sort(StudentList, comp);
		
		System.out.println("After sorting based on ids : " + StudentList);
	}
}
