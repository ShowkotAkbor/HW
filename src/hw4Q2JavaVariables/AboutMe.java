package hw4Q2JavaVariables;
public class AboutMe {
    // here variable is declared
	public String name;
	public char sex;
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
		System.out.println("My name: "+name+"\n Sex: "+sex+" \n Height: "+height+"\n  Age: "+age+"\n Cell: "+cell+"\n Zipcode: "+zipcode+"\n Weight: "+weight+"\n MoveToUsa: "+moveToUsa+"\n Citizenship: "+citizenship+"\n");
}
}


