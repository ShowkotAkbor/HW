package hw10Q3Abstraction;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();
	
	public default void studyRoom() {
		System.out.println();
	}
	public static void college() {
		System.out.println();
	}
}
