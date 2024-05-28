package day11.Inter.basic2;

import day08.Pen;

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

		// -----------------
		// IPet

		IPet[] arr2 = new IPet[3];
		
		// IPet으로 캐스팅 형변환 해서
		arr2[0] = (IPet)dog;

		arr2[1] = (IPet)cat;
		arr2[2] = new GoldenFish();
		
		for(IPet pet :arr2) {
			pet.playing();
		}
		
		//--------------

		//PetHouse 객체 만들기
		PetHouse d = new PetHouse();
		
		d.carePet((IPet)dog);
		d.carePet((IPet)cat);
		
		
		d.petInfo(arr2);
		
		
		
		
		
		
		
		
	}

	

}
