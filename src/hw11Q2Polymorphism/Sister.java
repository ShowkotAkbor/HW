package hw11Q2Polymorphism;

public class Sister {
	public int sister(int a, int b, int c) {
		int age1 = a + b + c;
		System.out.println("Age area from " + age1);
		return age1;
	}

	public int sister(int a, int b) {
		int age2 = a + b;
		System.out.println("Age area from" + age2);
		return age2;
	}

	public void sister(int a, int b, String c) {
		int age3 = a + b + Integer.parseInt(c);
		System.out.println("Age area from" + age3);
	}

	public static void sister(int a, String b, String c) {
		String age4 = String.valueOf(a) + b + c;
		System.out.println("age area from" + age4);

	}

	public final int sister(int a, int b, int c, double d) {
		int age5 = (int) (a + b + c + d);
		System.out.println("Age area from" + age5);
		return age5;
	}

	public static int sister(int a, int b, double c, String d) {
		int age6 = (a + b + (int) c + Integer.parseInt(d));
		System.out.println("Age6 area from" + age6);
		return age6;
	}
}
