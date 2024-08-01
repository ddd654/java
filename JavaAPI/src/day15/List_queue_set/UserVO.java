package day15.List_queue_set;

public class UserVO implements Comparable<UserVO>{ // <>는 비교할 대상 

	private String name;
	private int age;

	//
	public UserVO() {

	}

	public UserVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
		
	}

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

	@Override
	public int compareTo(UserVO o) {
		// compareTo로 서로 비교해서 봔환 음수나오면 내림차순
		
		// 이름으로 대소비교
//		return this.name.compareTo(o.getName());
		
//		return o.getName().compareTo(this.name); //이름 내림차순
		
		return Integer.compare(this.age, o.getAge()); //숫자 오름차순
	}

	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + "]";
	}

}
