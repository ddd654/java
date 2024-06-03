package quiz15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {

	// 회원정보 관리 프로그램

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<UserVO> list = new ArrayList<>();

		while (true) {
			System.out.println("-------");
			System.out.println("[1.회원등록 2.회원전체보기 3.회원조회 4.정보삭제 5.종료]");
			System.out.println("메뉴");

			int menu = scan.nextInt();

			// 메뉴에 따른 기능 넣기
			if (menu == 1) {
				// 스캐너로 이름, 나이를 입력받고, User객체에 저장 후 리스트에 추가
				String name = scan.next();
				int age = scan.nextInt();
				list.add(new UserVO(name, age));

			} else if (menu == 2) {
				// list 안에 저장한 모든 회원정보를 반복문으로 출력
				for (int i = 0; i < list.size(); i++) {
					UserVO vo = list.get(i);
					System.err.println(vo.getName() + ", " + vo.getAge());
				}

			} else if (menu == 3) {
				// 찾을 이름을 입력 받고, 이름 나이 출력
				// 없으면 "~~님은 없습니다"

				for (int i = 0; i < list.size(); i++) {
					String name = scan.next();

					UserVO vo = list.get(i);
					if (vo.getName().equals(name)) {
						System.out.println(vo.getName() + ", " + vo.getAge());

					} else {
						System.out.println(name + "님은 없습니다");
					}
					break;
				}
			} else if (menu == 4) {
				// 삭제할 이름 입력받고, 이름과 동일한 User 객체를 삭제
				// 처음 발견되는 User만 삭제

				for (int i = 0; i < list.size(); i++) {
					String deleteName = scan.next();

					UserVO vo = list.get(i);
					if (vo.getName().equals(deleteName)) {
						list.remove(i);
						System.err.println("삭제");
						break;
					}
				}

			} else if (menu == 5) {
				// 종료
				System.out.println("종료");
				break;
			}
		}

	}
}
