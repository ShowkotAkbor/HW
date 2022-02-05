package hw8Q2Inheritance;
public class AnimalTest {
public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("\n.................................................\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();// single inheritance
		
		System.out.println("\n.................................................\n");
		// multi label inheritance
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		
		System.out.println("\n.................................................\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.animalInfo();

		System.out.println("\n.................................................\n");
		Mammal mammal = new Mammal();
		mammal.mammallinfo();
		mammal.animalInfo();

		System.out.println("\n.................................................\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammallinfo();
		dog.animalInfo();

		System.out.println("\n.................................................\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.animalInfo();

		System.out.println("\n.................................................\n");
		Bird bird = new Bird();
		bird.birdInfo();
	    bird.animalInfo();

		System.out.println("\n.................................................\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdInfo();
		robin.animalInfo();
}
}
