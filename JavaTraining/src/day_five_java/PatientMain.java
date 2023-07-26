package day_five_java;

import java.util.Queue;
import java.util.PriorityQueue;

public class PatientMain {
	public static void main(String[] args) {
		Queue<Patients> patient = new PriorityQueue<>();

		Patients p1 = new Patients(1, "Bhuvan", 5);
		Patients p2 = new Patients(2, "Simran", 4);
		Patients p3 = new Patients(3, "Kajol", 1);
		Patients p4 = new Patients(4, "Aditya", 7);
		Patients p5 = new Patients(5, "Arjun", 9);
		Patients p6 = new Patients(6, "Mahesh", 10);
		Patients p7 = new Patients(7, "Varun", 2);
		Patients p8 = new Patients(8, "Shreya", 6);
		Patients p9 = new Patients(9, "Kushi", 8);
		Patients p10 = new Patients(10, "Kruthika", 3);

		patient.add(p1);
		patient.add(p2);
		patient.add(p3);
		patient.add(p4);
		patient.add(p5);
		patient.add(p6);
		patient.add(p7);
		patient.add(p8);
		patient.add(p9);
		patient.add(p10);

		while (!patient.isEmpty()) {
			System.out.println(patient.poll());
		}
	}
}
