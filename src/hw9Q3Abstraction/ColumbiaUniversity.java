package hw9Q3Abstraction;

public class ColumbiaUniversity {
	// created a default constructor
	public ColumbiaUniversity() {
	}

	// How many keywords are used for the inheritance in javafor a regular class?
	// ans: one keyword( extends).
	// can a regular class inherits other abstract class or a regular class or
	// interface by extends key words?
	// ans:not possible.
	// Abstract method cannot be declared in regular class because of an abstract
	// class can not be instantiated.
	// public abstract void chemistry();

	public void biology() {
		System.out.println("This subject deals with living organism");
	}
}
