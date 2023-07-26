package day_seven_java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingExample {
public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\ANANYA SIRI\\Desktop\\JAVA\\jAVA_tRAINING\\sample.txt");
		
		FileWriter writer = new FileWriter(file, true);
		
		writer.append("\nline number 4");
		
		System.out.println("Writing process successfully completed.");
		
		writer.close();
		
	}
}
