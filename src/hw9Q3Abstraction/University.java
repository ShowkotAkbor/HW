package hw9Q3Abstraction;

public interface University extends College, Hospital {
	/* public University() {}
	 how many key words are used for the inheritance in interface?
	 two ,extends and implements.
	 Can an interface inherit other Interfaces, or a regular class or abstract
	 class by extends key word?
	 Ans:Interface can inherit multiple interface but it can not inherit regular or
	 abstract class by using extends key words.
	 how many inheritance is possible by inheritance?
	 Ans: more than one
	 Interface cannot have constructor because all data members in interface are
	 public static final by default .They are constants.
	 * 
	 */

	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {
		System.out.println();
	}

	public static void main() {
		System.out.println();

	}
}
