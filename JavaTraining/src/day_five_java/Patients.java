package day_five_java;

public class Patients implements Comparable<Patients> {
	private int id;
	private String name;
	private int priority;
	
	@Override
	public int compareTo(Patients o) {
		return Integer.compare(this.priority, o.priority);
	}
	
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
	
	public int getPriority() {
		return priority;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public Patients(int id, String name, int priority) {
		super();
		this.id = id;
		this.name = name;
		this.priority = priority;
	}
	
	public Patients() {
		super();
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", priority=" + priority + "]";
	}	
}
