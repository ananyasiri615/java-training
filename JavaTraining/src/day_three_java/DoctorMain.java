package day_three_java;

public class DoctorMain {
	public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Dermatologist dermatologist = new Dermatologist();
        Ophthalmologist ophthalmologist = new Ophthalmologist();
        Cardiologist cardiologist = new Cardiologist();

        doctor.cure();              // General treatment method
        dermatologist.cure();       // Treats skin conditions
        ophthalmologist.cure();     // Treats eye-related conditions
        cardiologist.cure();        // Treats heart-related conditions
    }
}
