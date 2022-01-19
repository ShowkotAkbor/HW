package hw3Q2JavaVariables;

public class AboutMe {
	public String biography;// here variable is declared
	public String Myname;
	public String name = ("showkot akbor");
	public char gender = 'M';// here gender M is initialized
	public double height = 5.7;
	public byte age = 33;
	public long cell = 2025529177l;
	public int zipcode = 22153;
	public float weight = 156.50f;
	public short moveToUsa = 2012;
	public boolean citizenship = true;
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AboutMe aboutMe = new AboutMe();
		/*
		 * System.out.println(aboutMe.name); System.out.println(aboutMe.gender);
		 * System.out.println(aboutMe.height); System.out.println(aboutMe.age);
		 * System.out.println(aboutMe.cell); System.out.println(aboutMe.zipcode);
		 * System.out.println(aboutMe.weight); System.out.println(aboutMe.moveToUsa);
		 * System.out.println(aboutMe.citizenship);
		 */
// bellow I try to do concatenate and also try to make organize
		System.out.println("..............Let " + "me " + "introduce" + " mySelf.....................");

		/*
		 * System.out.println("Name:"+aboutMe.name+" , "+"Gender:"+aboutMe.gender+", "
		 * +"Height:"+abo      utMe.height+" ,"+"Age:"+aboutMe.age+" ,"+"Cell:"+aboutMe.
		 * cell+" "+"zipcode:"+aboutMe.zipcode+" ,"+"" +
		 * "Weight:"+aboutMe.weight+" ,"+"MoveToUsa:"+aboutMe.moveToUsa+" ,"+"" +
		 * "Citizenship:"+aboutMe.citizenship+" ");
		 */
// bellow I tried to concatenate with line by line used by "\n"
		/*
		 * System.out.println("Name:"+aboutMe.name+"\n" +
		 * "Gender:"+aboutMe.gender+"\nHeight:"+aboutMe.height+"\n" +
		 * "Age:"+aboutMe.age+"\nCell:"+aboutMe.cell+"\n" +
		 * "zipcode:"+aboutMe.zipcode+"\n" +
		 * "Weight:"+aboutMe.weight+"\nMoveToUsa:"+aboutMe.moveToUsa+"\n" +
		 * "Citizenship:"+aboutMe.citizenship+"\n");
		 */

	}

}
