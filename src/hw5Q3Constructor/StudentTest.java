package hw5Q3Constructor;
public class StudentTest {
	public String studentName;
	public int id;
	public char sex;
	public float grade;
	public boolean javaProgrammer;

	public StudentTest() {
		System.out.println("This is from default Constructor of Student class;");
}
     public StudentTest(String studentName, int id, char sex, float grade, boolean javaProgrammer) {
		this.studentName = studentName;
		this.id = id;
		this.sex = sex;
		this.grade = grade;
		this.javaProgrammer = javaProgrammer;
        System.out.println("Student Name: "+studentName+", Id: "+id+", sex: "+sex+", grade: "+grade+", Java Programmer? Ans: "+javaProgrammer+"");
}
      public static void main(String[] args) {
        StudentTest studentTest = new StudentTest();
		StudentTest studentTest1 = new StudentTest("Md Showkot Akbor", 382865, 'M', 3.976f, true);
}

}
