package hw8Q3Abstraction;

public interface LawSchool {
	public void lawInfo();
	
	public default void constitution() {
		System.out.println("this default method from Lawschool interface");
	}
	public static void lawSchoolInfo() {
		System.out.println("this static method from LawSchool Interface");
	}
}
