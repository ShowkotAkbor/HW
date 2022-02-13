package hw11Q3Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("\n......................Regular Class ColumbiaUniversuty...................\n");
	ColumbiaUniversity columbiaUniversity =new ColumbiaUniversity();
	ColumbiaUniversity.columbiaUniversityInfo();
	columbiaUniversity.biology();
	columbiaUniversity.cafeteria();
	columbiaUniversity.commonRoom();
	columbiaUniversity.laboratory();
	columbiaUniversity.languageClub();
	columbiaUniversity.emergencyRoom();
	columbiaUniversity.surgeryRoom();
	columbiaUniversity.cafeteria();
	columbiaUniversity.lawInfo();
	columbiaUniversity.aeronauticalInfo();
	columbiaUniversity.vocationalInfo();
	columbiaUniversity.classSize();
	columbiaUniversity.playGround();
	columbiaUniversity.teacher();
	columbiaUniversity.antomyLab();
	columbiaUniversity.hygine();
	columbiaUniversity.mechanicalLab();
	
	System.out.println("/n.........................Abstract Class...............\n");
	MedicalSchool medicalSchool =new ColumbiaUniversity();
	MedicalSchool.mediclalSchool();
	medicalSchool.biochemistryLab();
	medicalSchool.antomyLab();
	
	}
	
	

}
