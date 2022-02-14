package hw8Q3Abstraction;

public class ColumbiaUniversity {
	// created a default constructor
	public ColumbiaUniversity() {
	}

	// Abstract method cannot be declared in regular inside class because of an abstract class can not be instantiation.
	// public abstract void chemistry();
	public void biology() {
		System.out.println("This subject deals with living organism");
	}
}
