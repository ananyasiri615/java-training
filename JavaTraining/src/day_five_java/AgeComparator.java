package day_five_java;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return Integer.valueOf(o2.getAge()).compareTo(o1.getAge());
	}
}
