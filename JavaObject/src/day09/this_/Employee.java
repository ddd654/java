package day09.this_;

public class Employee extends Person_this {

	String department;
	
	Employee(String name, int age, String department){
		this.name = name;
		this.age = age;
<<<<<<< HEAD
		this.department = department; 
=======
		this.department = department;
>>>>>>> refs/remotes/origin/JavaObject
	}

	String info() {
		return "이름:" + name + ", 나이" + age + ", 부서" + department;

	}
}
