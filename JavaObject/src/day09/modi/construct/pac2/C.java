package day09.modi.construct.pac2;

import day09.modi.construct.pac1.A;

public class C {
	A a = new A(1); //public으로 접근 가능
	A a2 = new A(true); //default 접근 불가 -같은 패키지끼리
	A a3 = new A("흥"); //private 접근 불가

}
