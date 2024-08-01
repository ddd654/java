package day09.super_;

public class Child_super extends Parent{

//	Child() {
//		super(); // 부모의 기본생성자
//	}
	
	

	/*
	 자식은 super()를 통해 부모님의 생성자와 연결이 되어 있음
	 
	 1. 부모님의 기본생성자를 만듬
	 2. 부모님의 생성자 타입과 강제 연결
	 */
	
	//2.
	Child_super(){
		super("fa", "ma");
	}
	
	Child_super(String father, String mother){
		super(father, mother); //부모님 것을 빌려쓰는중
	}
	
}
