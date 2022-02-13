package hw11Q3Abstraction;

public interface VocationalSchool {
	public void vocationalInfo();
	
	public default void tools() {
		System.out.println("this default method from vocationalschool interface");
	}
	public static void vocationalSchoolInfo() {
		System.out.println("this static method from vocationalSchool Iinterface");
	}
	}
