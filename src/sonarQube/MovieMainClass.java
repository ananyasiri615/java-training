package sonarQube;

import java.util.ArrayList;


public class MovieMainClass {

	public static void main(String[] args) {
		ArrayList<Filmcrew> list = new ArrayList<>();
		
		Movie m = new Movie("SOTY");
		Actor actor = new Actor("Varun Dhawan");
		Singer singer = new Singer("Arjit singh");
		Lyricist lyricist = new Lyricist("Prasoon Joshi");
		
		list.add(actor);
		list.add(singer);
		list.add(lyricist);
		System.out.println("Movie "+m+" begins");
		makeMovie(list);
		System.out.println("Movie "+m+" ends");
		System.out.println();
		


	}

	public static void makeMovie(ArrayList<Filmcrew> list) {
		
		int i=0;
		System.out.println(list.get(i++)+ " as a actor");
		System.out.println(list.get(i++)+ " as a singer");
		System.out.println(list.get(i++)+ " as a lyricist");
		

		
	}

}

//public class MovieMainClass {
//
//	public static void main(String[] args) {
//		
//		makeMovie("SOTY", "Varun Dhawan", "Arijit Singh", "Prasoon Joshi");
//		System.out.println("____________________________________________");
//		
//		makeMovie("YJHD", "Deepika Padukone", "Arijit Singh", "Prasoon Joshi");
//		System.out.println("____________________________________________");
//		
//		makeMovie("Aadipurush", "Prabhas", "Arijit Singh", "Manoj Muntashir");
//
//	}
//
//	public static void makeMovie(String movieName, String aName, String sName, String lName) {
//
//		Movie m = new Movie(movieName);
//
//		System.out.println("Movie (" + m.getName() + ") begins");
//
//		Artist actor = new Actor(aName);
//
//		actor.getInfo();
//
//		Artist singer = new Singer(sName);
//
//		singer.getInfo();
//
//		Artist lyricist = new Lyricist(lName);
//
//		lyricist.getInfo();
//
//		System.out.println("Movie (" + m.getName() + ") ends");
//	}
//}
