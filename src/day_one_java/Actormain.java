package day_one_java;

public class Actormain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Actor [] actors = new Actor[3];

		Actor a1 = new Actor(1, "Will Smith", "Male", "Hollywood");

		Actor a2 = new Actor(2, "Shah Rukh Khan", "Male", "Bollywood");

		Actor a3 = new Actor(3, "Anushka Sharma", "FeMale", "Bollywood");

		actors[0] = a1;

		actors[1] = a2;

		actors[2] = a3;

		System.out.println("The size of the array : " + actors.length);

		System.out.println("The actor at index 1 : " + actors[1].getName());

		System.out.println("The actor at index 2 : " + actors[2]);

		//System.out.println("The actor at index 2 : " + actors[2].toString());

		//iterate using for-each loop

		for(Actor val : actors) {

		System.out.println(val.toString());

		}

		}

		 

		}

		 







//String arr[] = new String[4];
//
//Actor obj = new Actor("1","prabhas","M","Tollywood");
//
//arr[0] = obj.id;
//arr[1] = obj.name;
//arr[2] = obj.gender;
//arr[3] = obj.industry;



//
//for(int i=0;i<arr.length;i++) {
//	System.out.println(arr[i]);
//	
//}

