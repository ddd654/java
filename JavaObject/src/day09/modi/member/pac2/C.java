package day09.modi.member.pac2;

import day09.modi.member.pac1.A;

public class C {
	
	public B() {
		// 클래스 A를 새로운 a로 하여금 사용
		A a = new A();
		a.var1 = 1;
		a.var2 = 2;
		a.var3 = 3; // private로 사용 못함

		a.method01();
		a.method02();
		a.method03(); // private로 사용 못함

		// ctrl + space 에서
		// 초록색 public
		// 파란색 default
		// 빨간색 protected
		
		A aa = new A(1);
		aa.var =1;
		aa.method();
		
		//접근 못함
	}
}
