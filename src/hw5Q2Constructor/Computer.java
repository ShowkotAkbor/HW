package hw5Q2Constructor;

public class Computer {
	// here declared some variables
	public String brand;
	public String model ;
	public String operatingSystem ;
	public int price;
	public char grade;
	public boolean madeInUsa;
	// here this is default constructor declared
	public Computer() {
		System.out.println();
	}
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUsa) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;

		System.out.println("Brand Name:" + brand + "  ,  Model name:" + model + " , OperatingSystem :" + operatingSystem
				+ " ,  Price:" + price + " , Grade:" + grade + " ,   Made In USA:" + madeInUsa + "  ");
	}

	

}
