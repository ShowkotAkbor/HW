package hw11Q3Abstraction;

public interface University extends College, Hospital {
	// public University() {}

	// interface cannot have constructor because all data members in interface are
	// public static final by default;they are constants
	// how many keywords are used for the inheritance in Interface, answer by Java
	// comments?
	// there is one keyword(extends) used for inheritance
	// Can an interface inherit other Interfaces, or a regular class or abstract
	// class by extends key word?
	// interface can inherits multiple interface but it can not inherit regular or
	// abstract
	// class by using extends key word.

	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {
		System.out.println("this default method from university interface");
	}

	public static void universityInfo() {
		System.out.println("this static method from university interface");

	}
}
