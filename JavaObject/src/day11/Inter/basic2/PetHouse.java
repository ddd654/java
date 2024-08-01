package day11.Inter.basic2;

public class PetHouse {
	// 1. 메서드 carePet()
	// 매개변수 - 펫들의 공통부모타입
	// 기능 - instaneof 로 적절한 펫타입으로 캐스팅
	// 반환 x

//	void carePet(IPet pet) {
//		if (pet instanceof Dog) {
//			Dog dog = (Dog) pet;
//			System.out.println("강아지");
//		} else if (pet instanceof Cat) {
//			System.out.println("고양이");
//		} else if (pet instanceof Shark) {
//			System.out.println("샤크");
//		}
//	}
	
	public void carePet(IPet pet) {
		if( pet instanceof Cat) {
			Cat cat = (Cat) pet;
			cat.eating();
			cat.playing();
		} else if (pet instanceof Dog) {
			Dog d = (Dog)pet;
			d.eating();
		} else if ( pet instanceof GoldenFish) {
			GoldenFish g = (GoldenFish) pet;
			g.swiming();
		}
	}
	

	// 2. 메서드 petInfo()
	// 매개변수 - IPet[]
	// 기능 배열반복
	// 반환x

	void petInfo(IPet[] pet) {
		for(IPet pet : arr)
			pet.playing();
	}

	
}
