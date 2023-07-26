package day_three_java;

public class Mainoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From inside main method");
		main();
		main("maha");

	}
	public static int main() {
		// TODO Auto-generated method stub
		System.out.println("From main without parameter method");
		return 0;

	}
	public static void main(String name) {
		// TODO Auto-generated method stub
		System.out.println("From main with name parameter");

	}

}

