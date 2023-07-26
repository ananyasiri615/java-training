package day_five_java;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
public static void main(String[] args) {
		
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.add(101);
		queue.add(104);
		queue.add(107);
		queue.add(103);
		queue.add(102);
		queue.add(109);
		
		/*
		 * for(int val : queue) { System.out.println(val); }
		 */
		System.out.println("_____________________________________");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll()); 
		}
		
		
	}
}
