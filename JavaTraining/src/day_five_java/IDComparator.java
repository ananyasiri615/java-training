package day_five_java;

import java.util.Comparator;

public class IDComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return Integer.valueOf(o1.getId()).compareTo(o2.getId());
	}
}
