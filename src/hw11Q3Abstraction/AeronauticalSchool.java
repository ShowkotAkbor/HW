package hw11Q3Abstraction;

public interface AeronauticalSchool {
	public void aeronauticalInfo();
	
	public default void rocket() {
		System.out.println("this default method from aerionauticalschool interface");
	}
	public static void aeronauticalSchoolInfo() {
		System.out.println("this static method from aeronauticalSchool interface");
	}
}
