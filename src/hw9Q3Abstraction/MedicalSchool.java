package hw9Q3Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	// how many keywords are used for the inheritance in Java for Abstract Class?
	// one extends key words
	// Can an Abstract Class inherit other Abstract Class or a regular class or
	// interface by extends keyword?
	// Abstract class can be inherit interface by implement and regular class as
	// well.
	// How many inheritances is possible by an Abstract Class?
	// more than one
	// default constructor created
	public MedicalSchool() {
	}

	// abstract method defined or declared
	public abstract void antomyLab();

	// bellow method was implemented
	public void biochemistryLab() {
		System.out.println("This field of study deals with living  micro orgnaism");
	}
}
