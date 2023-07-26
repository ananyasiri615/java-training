package day_two_java;

public class Doctor extends Man {

	private String hospital;

	public Doctor(String hospital, String name, String address, String gender) {
		super(name, address, gender);
		this.hospital = hospital;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "Doctor [hospital=" + hospital + ", name=" + name + ", address=" + address + ", gender=" + gender + "]";
	}
	
	



}

