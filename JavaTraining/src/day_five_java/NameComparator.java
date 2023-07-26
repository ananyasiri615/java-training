package day_five_java;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getName() == o2.getName()) {
			return Integer.valueOf(o1.getAge()).compareTo(o2.getAge());
		}
		else {
			return o1.getName().compareTo(o2.getName());
		}
	}	
}
