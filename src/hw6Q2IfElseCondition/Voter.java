package hw6Q2IfElseCondition;
public class Voter {
	public static void main(String[] args) {
		int age = 18;
		if (age == 18) {
			System.out.println("I am a Voter");
		} else {
			System.out.println("I am not a Voter");
		} if (age < 18) {
			System.out.println("I am not a voter");
		} else if (age>18) {
			System.out.println("I am a Voter");
		} else {
			System.out.println("Please add a valid age");
		}
}
}

