package hw10Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super("Hossain Ahamed", 67, 'M', false);
		super.father();
		super.fatherInfo("Hossain Ahamed", 67, 'M', false);
		super.familyName = "Hossain Ahmed";
		super.age = 67;
		super.sex = 'M';
		super.usCitizen = false;
		System.out.println("Family name: " + familyName + " Age: " + age + " Sex: " + sex + " Us Citizen: " + usCitizen + "");
		System.out.println();
	}

	public Daughter(String birthMonth, int age) {

		super.father();
		super.fatherInfo("Hossain Ahamed", 67, 'M', false);
		super.familyName = "Hossain Ahmed";
		super.age = 67;
		super.sex = 'M';
		super.usCitizen = false;
		System.out.println("Family name: " + familyName + " Age: " + age + " Sex: " + sex + " Us Citizen: " + usCitizen + "");

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Daughter birth Month: " + birthMonth + " Age: " + age + "");
	}

	public void daughter() {
        super.father();
		super.fatherInfo("Hossain Ahamed", 67, 'M', false);
		super.familyName = "Hossain Ahmed";
		super.age = 67;
		super.sex = 'M';
		super.usCitizen = false;
		System.out.println(
				"Family name: " + familyName + " Age: " + age + " Sex: " + sex + " Us Citizen: " + usCitizen + "");

		System.out.println();

	}

	public void daughterInfo(String birthMonth, int age) {
		super.father();
		super.fatherInfo("Hossain Ahamed", 67, 'M', false);
		super.familyName = "Hossain Ahmed";
		super.age = 67;
		super.sex = 'M';
		super.usCitizen = false;
		
		System.out.println("Family name: " + familyName + " Age: " + age + " Sex: " + sex + " UsCitizen: " + usCitizen + "");

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Daughter birth Month: " + birthMonth + " Age: " + age + "");
	}

}
