package quiz18;

public class Data {
	private String name;
	private String age;
	private String mail;
	private String direction;
	
	
	
	
	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + ", mail=" + mail + ", direction=" + direction + "]";
	}


	public Data(String name, String age, String mail, String direction) {
		super();
		this.name = name;
		this.age = age;
		this.mail = mail;
		this.direction = direction;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	
	
}
