package day09.encap.data;

public class Member {

	// 단순히 데이터를 저장하는 용도

	private String name;
	private int age;
	private String email;
	private String addr;
	private String phone;

	//기본생성자 단축키 - ctrl space
	public Member() {

	}
	
	// alt shift s - construstor using field
	// 생성자를 빠르게 만드는 방법

	public Member(String name, int age, String email, String addr, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.addr = addr;
		this.phone = phone;
	}

	// alt shift s -getter setter 생성 단축키
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
