package hw11Q3Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {


	// created a default constructor
	public ColumbiaUniversity() {

	}

	public void biology() {
		System.out.println("This subject deals with living organism");
	}

	public static void columbiaUniversityInfo() {
		System.out.println("This method static form ColumbiaUniversity  Class");
	}

	@Override
	public void commonRoom() {
		System.out.println("commonRoom method from College Interface");

	}

	@Override
	public void laboratory() {
		System.out.println("Llaboratory method from College Interface");

	}

	@Override
	public void languageClub() {
		System.out.println("languageClub method form college Interface");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("emergencyRoom method from Hospital Interface");
	}

	@Override
	public void surgeryRoom() {
		System.out.println("surgeryRoom method from Hospital Interface");

	}

	@Override
	public void cafeteria() {
		System.out.println("cafeteria method from Hospital Interface");

	}

	@Override
	public void lawInfo() {
		System.out.println("lawInfo method from LawSchool Interface");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("aeronauticalInfo method  from AeronauticalSchool Interface");

	}

	@Override
	public void vocationalInfo() {
		System.out.println("vocationalInfo method  from VocationalSchool Interface");
	}

	@Override
	public void classSize() {
		System.out.println("classSize method from Unversity Interface");
	}

	@Override
	public void playGround() {
		System.out.println("playground method from University Interface");

	}

	@Override
	public void teacher() {
		System.out.println("teacher method from University Interface");
	}

	@Override
	public void antomyLab() {
		System.out.println("antomyLab method from MedicalSchool Abstract class");

	}

	@Override
	public void hygine() {
		System.out.println("hygine method from NursingSchool Abstract class");

	}

	@Override
	public void mechanicalLab() {
		System.out.println("mechanicalLab method from engineeringSchool Abstract class");

	}
}
