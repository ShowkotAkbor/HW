package hw11Q3Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("\n......................Regular Class ColumbiaUniversuty...................\n");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		ColumbiaUniversity.columbiaUniversityInfo();// when method is static its belonged to class so no need to creats objects.
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
		columbiaUniversity.anthropology();
		columbiaUniversity.rocket();
		ColumbiaUniversity.mediclalSchool();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.gymnasium();

		System.out.println("/n.........................Abstract Class MedicalSchiool ...............\n");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		MedicalSchool.mediclalSchool();
		medicalSchool.biochemistryLab();
		medicalSchool.antomyLab();

		System.out.println("\n.........................Interface university................................\n");
		University university = new ColumbiaUniversity();
		University.universityInfo();
		university.gymnasium();
		university.classSize();
		university.playGround();
		university.teacher();

		System.out.println("\n.........................AbstractClass NursingSchool..........................\n");
		NursingSchool nursingSchool = new ColumbiaUniversity();
		nursingSchool.hygine();
		nursingSchool.caring();

		System.out.println("\n.........................Interface Vocational.......................................\n");
		VocationalSchool vocationalSchool = new ColumbiaUniversity();
		vocationalSchool.vocationalInfo();
		vocationalSchool.tools();
		VocationalSchool.vocationalSchoolInfo();

		System.out.println("\n.........................Interface LawSchool........................................\n");
		LawSchool lawSchool = new ColumbiaUniversity();
		lawSchool.lawInfo();
		LawSchool.lawSchoolInfo();

		System.out.println("\n.........................regular class RockefellerUniversity......................\n");

		RockefellerUniversity rockefellerUniversity = new ColumbiaUniversity();
		rockefellerUniversity.maths();
		rockefellerUniversity.aeronauticalInfo();
		rockefellerUniversity.mechanicalLab();

		System.out.println("\n.........................AbstractClass EngineeringUniversity.....................\n");

		EngineeingSchool engineeingSchool = new ColumbiaUniversity();
		engineeingSchool.mechanicalLab();
		engineeingSchool.computerLab();

		System.out.println("\n.........................regular class NYUniversity.................................\n");
		NYUniversity nyUniversity = new ColumbiaUniversity();
		nyUniversity.anthropology();

		System.out.println("\n.........................Interface aeronauticalSchool...................................\n");
		AeronauticalSchool aeronauticalSchool = new ColumbiaUniversity();
		aeronauticalSchool.aeronauticalInfo();
		aeronauticalSchool.rocket();

	}

}
