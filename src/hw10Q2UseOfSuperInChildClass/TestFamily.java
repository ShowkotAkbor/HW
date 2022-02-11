package hw10Q2UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("..........default constructor initialized for family class..........");
		Daughter daughter01 = new Daughter();

		System.out.println("..........parameterized constructor initialized for family class..........");
		Daughter daughter02 = new Daughter("march", 21);

		System.out.println("..........void type method initialized for family class..........");
		daughter02.daughter();

		System.out.println("..........parameterized method initialized for family class..........");
		daughter02.daughterInfo("june", 16);

		System.out.println("..........default constructor initialized for family class..........");
		Father father01 = new Father();

		System.out.println("..........parameterized constructor initialized for family class..........");
		Father father02 = new Father("Hossain Ahamed", 67, 'M', false);

		System.out.println("..........void type method constructor initialized for family class..........");
		father02.father();

		System.out.println("..........parameterized method initialized for family class..........");
		father02.fatherInfo("Hossain Ahamed", 67, 'M', false);

	}

}
