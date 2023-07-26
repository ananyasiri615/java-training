package day_four_java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
	
	public static void main(String[] args) {
		
		readFile();
		
	}
	
	public static void readFile() {
		
		//Create a file object
		File file = new File("C:\\Users\\ANANYA SIRI\\Desktop\\sample.txt");
		
		//Create a filereader object using file object
		FileReader reader = null;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Create a bufferedReader object using file reader object
		BufferedReader bf = new BufferedReader(reader);
		
		String str = null;
		
		try {
			while( (str = bf.readLine()) != null) {
				System.out.println(str);
			}
			reader.close();
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
