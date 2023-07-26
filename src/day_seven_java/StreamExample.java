package day_seven_java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] args) {
		
		Book b1 = new Book(1, "Geetanjali", 200.0);
		Book b2 = new Book(2, "Godan", 150.0);
		Book b3 = new Book(3, "The God of Small Things", 170.0);
		
		List<Book> books = new ArrayList<>();
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		List<Book> filteredList = books.stream().filter(p -> p.getPrice() > 150.0).collect(Collectors.toList());
		
		filteredList.forEach(b -> System.out.println(b));
		
		
	}

}
