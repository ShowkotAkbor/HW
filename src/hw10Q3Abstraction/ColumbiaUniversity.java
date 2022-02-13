package hw10Q3Abstraction;

public class ColumbiaUniversity {
	// created a default constructor
	public ColumbiaUniversity() {
	}

	// Abstract method cannot be declared in regular class because of an abstract
	// class can not be instantiated
	// how many keywords are used for the inheritance in Java for a regular Class?
	// Ans :only one key word( extends)
	// Can a regular Class inherit other Abstract Class or a regular class or
	// interface by extends or implements keyword?
	// no regular class cannot inherit abstract class or interface class
	// How many inheritances is possible by a regular Class?
	// one

	// public abstract void chemistry();
	public void biology() {
		System.out.println("This subject deals with living organism");
	}
}
