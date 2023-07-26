package day_five_java;

public class Student /* implements Comparable<Student> */ {

	private int id;
	private String name;
	private int age;

	/*
	 * //compare students based on their id
	 * 
	 * @Override public int compareTo(Student o) { int result =
	 * Integer.valueOf(this.id).compareTo(o.id); //if result == 0 both the names are
	 * equal //if result > 0 o object's name is greater //if result <0 this object's
	 * name is greater return result; }
	 * 
	 */
	/*
	 * //compare students based on their name
	 * 
	 * @Override public int compareTo(Student o) { int result =
	 * this.name.compareTo(o.name); //if result == 0 both the names are equal //if
	 * result > 0 o object's name is greater //if result <0 this object's name is
	 * greater return result; }
	 */

	/*
	 * //compare students based on their name
	 * 
	 * @Override public int compareTo(Student o) { int result =
	 * Integer.valueOf(o.age).compareTo(this.age); //if result == 0 both the names
	 * are equal //if result > 0 o object's name is greater //if result <0 this
	 * object's name is greater return result; }
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
