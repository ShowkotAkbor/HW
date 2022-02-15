package hw11Q2Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		Sister sister = new Sister();
		sister.sister(10, 12);
		sister.sister(21, 32, 35);
		sister.sister(20, 19, "48");
		sister.sister(21, 14, 31, 33);
		Sister.sister(11, "thirtyfive", "fortythree");
		Sister.sister(12, 23, 39, "25");

		System.out.println("\n.......................niece Class................\n");
		Sister niece = new Sister();
		niece.sister(7, 3);
		niece.sister(8, 10, 13);
		niece.sister(16, 21, "31");
	}
}