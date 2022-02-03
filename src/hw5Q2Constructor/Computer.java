package hw5Q2Constructor;
public class Computer {
	// here declared some variables
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUsa;
    // Declared default constructor 
	public Computer() {
		System.out.println("This is from default Contructor of Computer Class");
}
    // Declared parameterized constructor 
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUsa) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;

		System.out.println("Brand Name: "+brand+", Model: "+model+", OperatingSystem: "+operatingSystem
				+", Price: "+price+", Grade: "+grade+", Made In USA: "+madeInUsa+"");
}
}
