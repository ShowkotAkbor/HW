package hw3Q2JavaVariables;
public class AboutMe {
	public String biography;// here variable is declared
	public String Myname;
	public String name = ("showkot akbor");
	public char sex = 'M';// here veritable is initialized
	public double height = 5.7;
	public byte age = 33;
	public long cell = 2025529177l;
	public int zipcode = 22153;
	public float weight = 156.50f;
	public short moveToUsa = 2012;
	public boolean citizenship = true;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println("..............Let " + "me " + "introduce" + " mySelf.....................");
		System.out.println("Name: "+ aboutMe.name);
		System.out.println("Sex: "+aboutMe.sex);
		System.out.println("Height: "+aboutMe.height); 
		System.out.println("Age: "+aboutMe.age);
		System.out.println("Cell: "+aboutMe.cell); 
		System.out.println("Zipcode: "+aboutMe.zipcode);
		System.out.println("Weight: "+aboutMe.weight); 
		System.out.println("Move to USA: "+aboutMe.moveToUsa);
		System.out.println("Citizeship:" +aboutMe.citizenship);
		 // bellow I try to do concatenate and also try to make organize
		System.out.println("################################");
		System.out.println("Name:"+aboutMe.name+","+"Sex: "+aboutMe.sex+","+"Height: "+aboutMe.height+" ,"+"Age: "+aboutMe.age+" ,"+"Cell: "+aboutMe.cell+" ,"+"zipcode: "+aboutMe.zipcode+" ,"+" "+"Weight: "+aboutMe.weight+","+"MoveToUsa: "+aboutMe.moveToUsa+" ,"+" " +"Citizenship: "+aboutMe.citizenship+"");
}
}
