package hw11Q3Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	// how many keywords are used for the inheritance in Java for Abstract Class?
	// Ans : one extends key words
	// Can an Abstract Class inherit other Abstract Class or a regular class or
	// interface by extends or implements keyword?
	// Ans:yes,abstract class can inherits other abstract class by using extends key
	// word and implements by interface.
	// How many inheritance is possible by an abstract class?
	// Ans:two,extends keywords for another abstract and implements keywords for
	// interface
	// Abstract class can be inherit interface by implement and regular class as
	// well.
	// How many inheritances is possible by a regular class?
	// Ans:one

	// default constructor created
	public MedicalSchool() {
		System.out.println("this is from medicalSchool default constructor");
	}

	// abstract method defined or declared
	public abstract void antomyLab();

	// bellow method was implemented
	public void biochemistryLab() {
		System.out.println("This field of study deals with living  micro orgnaism");
	}

	public static void mediclalSchool() {
		System.out.println("This static method from medicalSchool abstract class");
	}
}
