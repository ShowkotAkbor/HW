package hw4Q2JavaVariables;

public class AboutMe {
// here variable is declared
	public String name;
	public char gender;
	public double height;
	public byte age;
	public long cell;
	public int zipcode;
	public float weight;
	public short moveToUsa;
	public boolean citizenship;

	// constructor declared
	public AboutMe() {
		System.out.println("This is all about me");
	}

	// method is implemented
	public void aboutMe() {
		System.out.println("My name:" + name + "\n Gender:" + gender + " \n Height:" + height + "\n  Age:" + age
				+ "\n Cell: " + cell + "\n Zipcode:" + zipcode + "\n Weight:" + weight + "\n MoveToUsa:" + moveToUsa
				+ "\n Citizenship:" + citizenship + "\n  ");

		/*
		 * System.out.println("name\n"); System.out.println("height\n");
		 * System.out.println("age\n"); System.out.println("cell\n");
		 * System.out.println("zipcode\n"); System.out.println("weight\n");
		 * System.out.println("moveToUsa\n"); System.out.println("citizenship");
		 */
	}

	public static void main(String[] args) {
		// AboutMe class is instantiated
		AboutMe myself = new AboutMe();// constructor is initialized,when object is created
		myself.aboutMe();

	}

}
