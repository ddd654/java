package day16.lambda;

public class Person {
	
	public void greeting(Say01 say) {
		say.talking(); 
		
		//Person 이 인터페이스를 실행시킨다
		
		
	}
	
	public void greeting(Say02 say) {
		String str = say.talking("안녕");
		System.out.println(str);
	}
	
	public void calculationg(Say03 say) {
		
		String result = say.calaulating(10, "apple");
		System.out.println(result);
	
	}
	
	
}
