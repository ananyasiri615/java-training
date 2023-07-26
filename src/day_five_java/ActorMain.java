package day_five_java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ActorMain {

	public static void main(String[] args) {
		LinkedList<Actor> ActorList = new LinkedList<>();
		ActorList.add(new Actor("Ajay", "Male", "BollyWood"));
		ActorList.add(new Actor("Tammana", "Female", "Tollywood"));
		ActorList.add(new Actor("Yash", "Male", "SandalWood"));
		ActorList.add(new Actor("Allu Arjun", "Female", "TollyWood"));
		
		for(Actor actor: ActorList) {
			System.out.println(actor);
}
			System.out.println("interate using irorator");
			Iterator<Actor> iterator = ActorList.descendingIterator();

			while(iterator.hasNext()) {
				Actor actor1 = iterator.next();
				System.out.println(actor1);
			}
			
		
	}

}