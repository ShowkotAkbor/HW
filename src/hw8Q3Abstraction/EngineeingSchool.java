package hw8Q3Abstraction;

public abstract class EngineeingSchool extends RockefellerUniversity{

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("Student must sign up before access the lab");

	}
}
