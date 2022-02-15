package hw9Q2Encapsulation;

//we can modifies variables from prive to public by set and get by the eclipse source then generate by set and get then select after last variable or wherever i want.f  
public class Employee {
	private String name;
	private int age;
	private char sex;
	private boolean usCitizen;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

}