package hw5Q2Constructor;
public class ComputerTest {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUsa;

	public ComputerTest() {
		System.out.println("This is from default Contructor of Computer Class");
}
    public ComputerTest(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUsa) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;

		System.out.println("MyBrand : "+brand+", Model name : "+model+", OperatingSystem : "+operatingSystem+", Price:$"+price+", Grade: "+ grade+", Made In USA? Ans: "+madeInUsa+"");
}
    public static void main(String[] args) {
		ComputerTest computerTest = new ComputerTest();
		ComputerTest computerTest1 = new ComputerTest("Apple", "Macbook Air", "Macbook OS Mojave", 800, 'A' ,false);
		ComputerTest computerTest2 = new ComputerTest("HP", "Hp Spectra", "Windows11", 1000, 'B',true);
}
}
