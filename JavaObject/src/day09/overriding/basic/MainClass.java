package day09.overriding.basic;

import quiz04.MyAccount;

public class MainClass {
	public static void main(String[] args) {
		
		child c =new child();
		c.method01(); //물려받은 메서드
		c.method02(); //오버라이딩된 메서드
	}
	
	
	
}

