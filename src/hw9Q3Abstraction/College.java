package hw9Q3Abstraction;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {
		System.out.println();
	}

	public static void studyRoom() {
		System.out.println();
	}
}
