package hw7Q2UseOfNestedIf;
import java.util.Scanner;
public class DiabeticCondition {
	public static void main(String[] args) {
		System.out.println("please enter your Hemoglobin A1c value bellow");
		Scanner scanner = new Scanner(System.in);
		double hbga1c = scanner.nextDouble();
		if (hbga1c > 6.4) {
			System.out.println("I am a diabetic patient");
		} else { 
			System.out.println("Congratulation! you are not diabetic");
			if (hbga1c >= 5.7)
				if (hbga1c < 5.7)
					System.err.println("I am a pre-diabetic patient");
				else {
					System.out.println("I am a healthy person");
		}
			     }
}
}
