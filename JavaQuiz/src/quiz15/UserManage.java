package quiz15;

import java.util.ArrayList;
import java.util.List;

public class UserManage implements {

	// 저장할 리스트
	private List<UserVO> list = new ArrayList<E>();

	// 정보 추가
	public void insert(String name, int age) {
			UserVO vo = new UserVO( name,  age);
			list.add(vo);
			
			
		};

	// list 안에 저장한 모든 회원정보를 반복문으로 출력

	for( int i = 0;i<list.size();i++)
	{
		UserVO vo = list.get(i);
		System.err.println(vo.getName() + ", " + vo.getAge());
	}

	// 회원정보 검색
	}System.out.println("검색할 이름");
	String name = scan.next();

	boolean flag = false;for(
	int i = 0;i<list.size();i++)
	{

	UserVO vo = list.get(i);
	String n = vo.getName();

	if (vo.equals(n)) {
		System.out.println(vo.getName() + ", " + vo.getAge());
		flag = true; // if문을 실행함

	}

	if(!flag) {
		System.out.println(name+"님은 없습니다");
	}

	// 회원 검색
	public boolean search(String name) {
		
		System.out.println("회원 정보 삭제");
		System.out.println("삭제할 이름");
		
		String name = scan.next();
		
		boolean flag = false;
		
		for(int i = 0 ; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				list.remove(i);
				System.out.println(name +"님의 정보를 삭제");
				flag = true;
				break;
			}
		}
		
		
		return flag;
		
		
	}

	public boolean delete (String name)	{
		
		boolean 
		

}
}
