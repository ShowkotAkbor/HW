package hw10Q3Abstraction;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public static void pharmacy() {
		System.out.println();
	}

}
