package hw11Q3Abstraction;

public class RockefellerUniversity extends EngineeingSchool implements AeronauticalSchool {
	public void maths() {
		System.out.println("This suject deals with  calculation and  problems solve");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("aeronauticalInfo method from Aeronautical Interface");

	}

	@Override
	public void mechanicalLab() {
		System.out.println("mechanicalLab method from EngineeringSchool Abstract Class");

	}
}
