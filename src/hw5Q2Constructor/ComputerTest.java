package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer1 = new Computer();
		Computer computer2 = new Computer("Apple", "Macbook Air", "MacOS Mojave", 800, 'A', false);
		Computer computerTest3 = new Computer("HP", "Hp Spectra", "Windows11", 1000, 'B', true);
	}
}
