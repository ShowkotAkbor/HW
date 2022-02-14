package hw11Q2Polymorphism;

//method overriding? when different methods type with same name and same
// parameters but differnt sytax or logic .
// @Override dosent allow in ststic class because it reserved for parent class.
// final cannot be override because it dosent allow any changes for inherits
// @Override not posiible for static as well

public class Niece extends Sister {
	@Override
	public int sister(int a, int b, int c) {
		int age1 = a + b - c;
		System.out.println("Age area from " + age1);
		return age1;
	}

	@Override
	public int sister(int a, int b) {
		int age2 = (a + b) - 2;
		System.out.println("Age area from" + age2);
		return age2;
	}

	@Override
	public void sister(int a, int b, String c) {
		int age3 = a - b + Integer.parseInt(c);
		System.out.println("Age area from" + age3);
	}

}
