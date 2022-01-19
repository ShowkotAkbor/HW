package hw5Q2Constructor;

public class ComputerTest {
	public String Brand;
	public String Model;
	public String OS;
	public int Price;
	public boolean MadeInUsa;
	public char Grade;

	public ComputerTest() {
		System.out.println("This is from default Contructor of Computer Class");
	}

	public ComputerTest(String brand, String model, String OS, int price, boolean madeInUsa, char grade) {
		Brand = brand;
		Model = model;
		OS = OS;
		Price = price;
		MadeInUsa = madeInUsa;
		Grade = grade;

		System.out.println("Brand Name:" + Brand + "\n Model name:" + Model + "\n OS :" + OS + "\n Price:" + Price
				+ "\n Made In USA:" + MadeInUsa + "\n Grade:" + Grade + "\n ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerTest computerTest = new ComputerTest();
		ComputerTest computerTest1 = new ComputerTest("Apple", "Macbook Air", "Macbook OS Mojave", 800, false, 'A');

	}

}
