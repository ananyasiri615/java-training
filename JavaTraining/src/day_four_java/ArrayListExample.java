package day_four_java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<String> subjects = new ArrayList<String>();
		//add method is used to add elements to the list
		subjects.add("Mathematics");
		subjects.add("Hindi");
		subjects.add("English");
		
		System.out.println("List of subjects is : " + subjects);
	}
}