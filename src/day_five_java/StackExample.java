package day_five_java;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
			
			Stack<Integer> stack = new Stack<>();
			
			stack.push(101);
			stack.push(102);
			stack.push(103);
			stack.push(104);
			stack.push(105);
			stack.push(106);
			stack.push(107);
			
			for(int val : stack) {
				System.out.println(val);
			}
			System.out.println("____________________________");
			while(!stack.empty()) {
				System.out.println(stack.pop()); 
			}
			
			
			
		}
	}


