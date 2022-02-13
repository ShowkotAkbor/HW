package hw11Q3Abstraction;

public interface LawSchool {
	public void lawInfo();
	
	public default void constitution() {
		System.out.println("this default method from vocationalschool interface");
	}
	public static void lawSchoolInfo() {
		System.out.println("this static method from vocationalSchool Iinterface");
	}
}
