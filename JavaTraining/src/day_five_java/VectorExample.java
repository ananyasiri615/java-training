package day_five_java;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Integer> list = new Vector<>();
		
		Vector<Integer> vc = new Vector<>();
		
		vc.addElement(101);
		vc.addElement(102);
		vc.add(103);
		vc.addElement(104);
		vc.addElement(104);

		for(int val : vc) {
			System.out.println(val);
		}
		
		System.out.println("______________________________________________________________");
		Enumeration em = vc.elements();
		
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}

}
