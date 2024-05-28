package day11.Inter.basic2;

public class Main {
	public static void main(String[] args) {

//		Dog dog = new Dog();
//
//		Cat cat = new Cat();
//		Tiger tiger = new Tiger();

		Animal dog = new Dog();

		Animal cat = new Cat();
		Animal tiger = new Tiger();

		Animal[] arr = { dog, cat, tiger };

		for (Animal ani : arr) {
			ani.eating();
		}

	}
}
