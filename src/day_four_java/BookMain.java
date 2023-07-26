package day_four_java;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class BookMain {
	public static void main(String[] args) {
		List<Student> bookList = new ArrayList<Student>();
		System.out.println("iterate using for-each loop");
		bookList.add(new Student("Maths", 86.56f));
		bookList.add(new Student("Science", 10.85f));
		bookList.add(new Student("History", 78.56f));
		bookList.add(new Student("Java", 56.54f));
		
		for(Student book: bookList) {
			System.out.println(book);
			
			System.out.println("interate using irorator");
			Iterator<Student> iterator = bookList.iterator();
			while(iterator.hasNext()) {
				Student book1 = iterator.next();
				System.out.println(book);
			}
			
		}
	}
}
