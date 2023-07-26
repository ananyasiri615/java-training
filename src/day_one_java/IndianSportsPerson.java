package day_one_java;

public class IndianSportsPerson {

	//instance property

	private int id;

	private String name;

	//static property

	private static String country = "India";


	//instance method

	public void displayPlayerInfo() {

		System.out.println("id : " + id + ", name : " + name);

	}


	//static method

	public static void displayCountryName() {

		System.out.println("The country name : " + country.toUpperCase());

	}

	public static void main(String[] args) {

		IndianSportsPerson p = new IndianSportsPerson();
	
		p.id = 101;
	
		p.name = "Virat Kohli";
	
		//In order to access the static properties of a class, we don't need an object
	
		System.out.println(IndianSportsPerson.country);
	
		//invocation of instance method
	
		p.displayPlayerInfo();
	
		//invocation of static method
		
		IndianSportsPerson.displayCountryName();
	}

	}

	 

