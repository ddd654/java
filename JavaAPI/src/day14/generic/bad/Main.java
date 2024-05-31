package day14.generic.bad;

public class Main {
	public static void main(String[] args) {
		
		
		//저장용 문자열
		ABC abc = new ABC();
		abc.setObj("사과");
		
		String str = (String)abc.getObj(abc);
		
		// 저장용 Person
		abc.setObj(new Person());
		Person p = (Person)abc.getObj();
	
		//Object 형은 무엇이든 저장할 수 있는데
		// 올바은 타입으로 형변환해야한다
	
	}
	
	
}
