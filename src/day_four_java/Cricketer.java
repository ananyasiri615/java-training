package day_four_java;

public class Cricketer {
	private String name;
    private String type;
    private int noOfRuns;

   
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setNoOfRuns(int noOfRuns) {
		this.noOfRuns = noOfRuns;
	}

	public Cricketer(String name, String type, int noOfRuns) {
        this.name = name;
        this.type = type;
        this.noOfRuns = noOfRuns;
    }

    @Override
	public String toString() {
		return "Cricketer [name=" + name + ", type=" + type + ", noOfRuns=" + noOfRuns + "]";
	}

	public int getNoOfRuns() {
        return noOfRuns;
    }
}
