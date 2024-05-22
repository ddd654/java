package day10.ClassCasting;

public class House {

	// 멤버변수 Student, Teacher, Employee
//	private Student[] s = new Student[11];
//	private Teacher[] t = new Teacher[22];
//	private Employee[] e = new Employee[22];

	private Person_this[] persons = new Person_this[100];
	private int index = 0;

	// 멤버변수에 순서대로, Person을 저장하는 메서드
	public void checkIn(Person_this p) {
//		persons[0] = p;
		persons[index] = p;
		index++;
	}

	// 배열에 저장된 회원의 이름을 출력
	public void confirm() {
		
		for(int i = 0; i < index; i++) {
			System.out.println(persons[i].info());
		}
	}

}
