package quiz15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListQuiz01 {
	public static void main(String[] args) {

		// 1. 숫자를 저장하는 리스트
		// 1~20까지 순서대로 저장

		// 2. UserV0을 저장할 리스트를 만들고, User 객체 3개를 저장

		// 3. 2번에서 list 객체 안에, 이름과 나이를 반복문으로 출력

		// 4. 2번 리스트에서 "홍길동"이 있으면 이름, 나이 출력

		// 5. 그 후 "홍길동" 객체 삭제

		// 1~20리스트
		List<Integer> list = new ArrayList<>();
		System.out.println(list);

		for (int i = 0; i <= 20; i++) {
			list.add(i);
		}
		System.out.println(list);

		////

		List<UserVO> userList = new ArrayList<>();
		userList.add(new UserVO("홍길동", 11));
		userList.add(new UserVO("바나나", 22));
		userList.add(new UserVO("복숭아", 33));

		// 각 리스트 값
//		System.out.println(userList.get(0).getName() + ", " + userList.get(0).getAge());
//		System.out.println(userList.get(1).getName() + ", " + userList.get(1).getAge());
//		System.out.println(userList.get(2).getName() + ", " + userList.get(2).getAge());

		for (int i = 0; i <= userList.size() - 1; i++) {
			System.out.println(userList.get(i).getName() + ", " + userList.get(i).getAge());

		}

		//
		System.out.println(userList.toString());

//		userList.add("홍길동");

		//
		//
		//
		List<Integer> list_1 = new ArrayList<>();

		for (int i = 1; i <= 20; i++) {
			list_1.add(i);
			
		}
		
		List<UserVO> list_2 = new ArrayList<UserVO>();

		list_2.add(new UserVO("홍길동", 11));
		list_2.add(new UserVO("복숭", 22));
		list_2.add(new UserVO("사과", 33));
		
		for(int i = 0; i < list_2.size(); i++) {
			UserVO v0 = list_2.get(i);
			System.err.println(v0.getName()+ ", " + v0.getAge());
			
		}
		
		
		for(int i = 0 ; i < list_2.size(); i++) {
			
			UserVO v0 = list_2.get(i);
			if(v0.getName().equals("홍길동")) {
				System.err.println("홍길동w이 있어요");
				System.out.println(v0.getName()+ ", " + v0.getAge());
			}
			
		}
		
		//
		//
		for(int i = 0; i < list_2.size(); i++) {
			
			if(list_2.get(i).getName()) {
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}
}
