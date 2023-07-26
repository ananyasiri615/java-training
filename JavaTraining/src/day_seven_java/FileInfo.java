package day_seven_java;

import java.io.File;
import java.io.IOException;

public class FileInfo {
	
	public static void main(String[] args) {
		//no file has been created
		//only an object of type File has been created
		File file = new File("sample.txt");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());

	}
}
