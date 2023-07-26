package day_five_java;

public class Footballer implements Comparable<Footballer>{

	private int id;
    private String name;
    private int noOfGoals;
    private int age;

    @Override
    public int compareTo(Footballer o) {
    	return Integer.compare(o.noOfGoals, this.noOfGoals);
    }
    public Footballer(int id, String name, int noOfGoals, int age) {
        this.id = id;
        this.name = name;
        this.noOfGoals = noOfGoals;
        this.age = age;
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


	public int getNoOfGoals() {
		return noOfGoals;
	}


	public void setNoOfGoals(int noOfGoals) {
		this.noOfGoals = noOfGoals;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
    public String toString() {
        return "Footballer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", noOfGoals=" + noOfGoals +
                ", age=" + age +
                '}';
    }
}
