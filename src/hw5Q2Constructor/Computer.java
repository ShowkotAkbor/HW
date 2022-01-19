package hw5Q2Constructor;

//a)
public class Computer {
	// here declared some variables
	public String Brand;
	public String Model ;
	public String OS ;
	public short Price;
	public boolean MadeInUsa;
	public char Grade;

	// here this is default constructor
	public Computer() {
		System.out.println();
	}

	public Computer(String Brand) { // here is  a parameterized constructor
		this.Brand = Brand;
		System.out.println("Computer name:" + Brand + "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Computer computer=new Computer();

	}

}
