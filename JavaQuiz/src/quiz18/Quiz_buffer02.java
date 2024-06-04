package quiz18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.StringTokenizer;

public class Quiz_buffer02 {
	public static void main(String[] args) {
		// 입사한 회사에서 매일 아침 7시에 매일 전송해야한다
		// ex) 2024_06_04_data.csv 이 내일이되면 2024_06_05_data.csv로 된다

		// 아침마다 csv파일을 읽어서 데이터베이스에 저장하는 코드를 생성해야 한다
		// 1. 버퍼를 사용해 csv파일을 읽어서 한줄에 하나씩 출력하세요

		// 2. 읽은 데이터는 , 구분자로 기준으로 분리해서
		// getter/setter를 가지는 Data클래스에 저장하고, 객체를 리스트에 저장하세요

		// Date사용, Data객체 본인이 생성, ArrayList사용하기

		String file = "2024_06_04_data.csv";
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\" + file;

		BufferedReader br = null;
		BufferedWriter bw = null;

		List<String> list1 = new ArrayList<String>();
		list1.add("사과");
		System.out.println(list1.toString());

		try {
			br = new BufferedReader(new FileReader(path));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String str1;
			System.out.println(br.readLine()); // 한줄 읽기

			// null이 아닐때까지 반복
			while ((str1 = br.readLine()) != null) {
				String[] arr1 = str1.split(",");
				bw.write(str1+ "\n");

			}
			bw.flush(); // 한줄 출력
			
			// null이 아닐때까지 반복
//			while ((str1 = br.readLine()) != null) {
//				String[] arr1 = str1.split(",");
//				System.out.println(Arrays.toString(arr1));
//
////							// 리스트에 넣기
////							for (String str2 : arr1) {
////								list1.add(str2);
////							}
//				bw.write(str1);
//
//			}
//			bw.flush(); // 한줄 출력

			
			
//				for (String str3 : list1) {
//					System.out.println(str3);
//				}

//				StringTokenizer st = new StringTokenizer(str1, ",");
//				String[] arr1 = st;
//				
//				System.out.println(st);

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
