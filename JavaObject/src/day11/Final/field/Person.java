package day11.Final.field;

public class Person {

	// final이 붙으면 초기화 혹은 생성자를 통해 초기화
	public final String nation;
	public final String ssn;
	public String name;

	public Person(String ssn, String name) {
		this.nation = "";
		this.ssn = ssn;
		this.name = name;
	}

}
