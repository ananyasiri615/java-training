package day_five_java;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileExample {

public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("sample.properties");
		
		Properties prop = new Properties();
		
		prop.load(reader);
		
		String appName = prop.getProperty("application.name");
		String author = prop.getProperty("author.name");
		String year = prop.getProperty("launch.year");
		
		System.out.println("Application name : " + appName);
		System.out.println("Author name : " + author);
		System.out.println("Launch Year : " + year);
		
		
	}

}
