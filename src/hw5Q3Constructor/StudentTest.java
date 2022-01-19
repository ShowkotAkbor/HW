package hw5Q3Constructor;

public class StudentTest {
	public String StudentName ;
	public int stId;
	public char Gender;
	public boolean isProgrammer ;
	public float Grade;

	public StudentTest() {
		System.out.println("This is from default Constructor of Student class");
	}

	public StudentTest (String StudentName,int stId,char Gender,boolean isProgrammer,float Grade) {
		this.StudentName=StudentName;
		this.stId=stId;
		this.Gender=Gender;
		this.isProgrammer=isProgrammer;
		this.Grade=Grade;
		System.out.println("Student Name:"+StudentName+" \n Sudent Id:"+stId+"\n Gender:"+Gender+"\n Is Programmer?: "+isProgrammer+"\n Grade:"+Grade+"\n ");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentTest studentTest =new StudentTest();
StudentTest studentTest1 =new StudentTest("Md showkot Akbor",382865,'M',true,3.976f);
	}

}
