package day_seven_java;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\ANANYA SIRI\\Desktop\\JAVA\\jAVA_tRAINING\\sample.txt");
		
		int ch = 0;
		
		while( (ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		
		
	}

}
