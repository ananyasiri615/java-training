package day_seven_java;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		System.out.println("iterate using for-each method");
		bookList.add(new Book(1, "Maths", 86.56f));
		bookList.add(new Book(2, "Science", 10.85f));
		bookList.add(new Book(3, "History", 78.56f));
		bookList.add(new Book(4, "Java", 56.54f));	
		bookList.forEach(p -> System.out.println(p.getName()));	

		
	}
}
