package day_six_java;

import day_five_java.Footballer;

public class Scientist implements Comparable<Scientist>{
	private int id;
	private String name;
	private int noOfExperiments;
	
	
	@Override
    public int compareTo(Scientist o) {
    	return o.name.compareTo(this.name);
    }
	public Scientist(int id, String name, int noOfExperiments ) {
		super();
		this.id = id;
		this.name = name;
		this.noOfExperiments = noOfExperiments;
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

	public int getNoOfExperiments() {
		return noOfExperiments;
	}

	public void setNoOfExperiments(int noOfExperiments) {
		this.noOfExperiments = noOfExperiments;
	}

	@Override
	public String toString() {
		return "Scientist [id=" + id + ", name=" + name + ", noOfExperiments=" + noOfExperiments + "]";
	}
	
	
}
