package hw10Q2UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println();
	}

	public Father(String name, int age, char sex, boolean usCitizen) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father name: " + name + " Age: " + age + " Sex: " + sex + " Us Citizen: " + usCitizen + "");
	}

	public void father() {
		System.out.println();
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Fathername: " + name + " Age: " + age + " Sex: " + sex + " Us Citizen: " + usCitizen + "");
	}
}
