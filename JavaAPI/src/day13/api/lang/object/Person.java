package day13.api.lang.object;


public class Person implements Cloneable{ //clone할수 있다고 표시만 할것
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ctrl space, alt shift s로 로버라이딩하기

	@Override
	public boolean equals(Object obj) {
		//obj에 있는 이름이 같으면 true
		if(obj instanceof Person) {
			Person p = (Person)obj;
			
			String s= p.getName();
			if(p.getName().equals(obj)) {
				return true;
			}
		}
		return false;
	}


	//멤버변수를 한번에 확인하도록 오버라이딩
	// alt shift s, 
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	//clone() 메서드는 오버라이딩해서 사용해야함
	@Override
	protected Object clone() throws CloneNotSupportedException {


		return super.clone();
	}

	// 더이상 사용하지 않아 사용을 자제해달라는 뜻
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("객체 소멸됨");
	}
	
	

}
