package hw8Q3Abstraction;

public interface University {
	// public University() {}
	/*
	 * interface cannot have constructor because all data members in interface are
	 * public static final by default;they are constants
	 */
	public void classSize();

	public void playGround();

	public void teacher();
}
