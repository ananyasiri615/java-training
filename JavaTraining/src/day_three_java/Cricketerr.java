package day_three_java;

public class Cricketerr extends Player {

	//protected int id;
		//protected String name;
		
		/*
		 * public void display() { 
		 * System.out.println("id : " + id + ", name : " +
		 * name); }
		 */
		@Override
		public Cricketerr getInfo(int id, String name) {
			return new Cricketerr(id, name);
		}

		private String cricType;
		
		public Cricketerr(int id, String name) {
			super(id, name);
		}

		public Cricketerr(int id, String name, String cricType) {
			super(id, name);
			this.cricType = cricType;
		}
		
		//same return type, name and signature
		@Override
		public void display() {
			System.out.println("id: " + id + ", name : " + name + ", cricType : " + cricType);
		}
		
	

}
