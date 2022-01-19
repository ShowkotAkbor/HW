package hw5Q3Constructor;

public class Student {
	public String StudentName = "Showkot";
	public int stId = 82865;
	public char Gender = 'M';
	public boolean isProgrammer = true;
	public float Grade = 3.976f;

	public Student() {
		System.out.println();
	}

public Student (String StudentName,int stId,char Gender,boolean isProgrammer,float Grade) {
this.StudentName=StudentName;
this.stId=stId;
this.Gender=Gender;
this.isProgrammer=isProgrammer;
this.Grade=Grade;
System.out.println("Student Name:"+StudentName+" \n Sudent Id:"+stId+"\n Gender:"+Gender+"\n Is HeadlessException Programmer: "+isProgrammer+"\n Grade:"+Grade+"\n ");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
