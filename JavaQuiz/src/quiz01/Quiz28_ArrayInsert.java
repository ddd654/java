package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz28_ArrayInsert {
	public static void main(String[] args) {

		// 사용자에게 수정하고 싶은 이름을 입력받아서
		// 해당 이름이 존재하면, 수정할 이름을 새롭게 입력박습니다.
		//
		// 만약 값이 없으면 "이름이 존재하지 않습니다." 로 출력
		//
		// 문자열의 비교
		// 문자열.equal(비교할 문자열)

		Scanner scan = new Scanner(System.in);

		System.out.print("수정할 학생의 별명을 입력>");
		String a = scan.next();

		String[] arr = { "강타", "문희준", "토니안", "사과", "바나나" };
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			if (a.equals(arr[i])) {
				System.out.println(a + "의 별명을 변경합니다");

				System.out.println(">");
				String change = scan.next();

				arr[i] = change;
				flag = true; // 찾은 경우에 true로 변경
				break;
			}

		}

		if (flag) {
			System.out.println(Arrays.toString(arr));

		} else {
			System.out.println(a + "은 없습니다.");

		}

	}
}
