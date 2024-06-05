package quiz18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

		// 날짜 year month day

		LocalDate today = LocalDate.now();
//		int year = today.getYear();
//		int month = today.getMonthValue();
//		int day = today.getDayOfMonth();
//		System.out.println(year + " " + month + " " + day);

		String now = today.format(DateTimeFormatter.ofPattern("yyyy_MM_dd"));
		System.out.println(now);

		String file = now + "_data.csv";

		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\" + file;

		BufferedReader br = null;
		BufferedWriter bw = null;

		List<Data> list1 = new ArrayList<>();

		try {
			br = new BufferedReader(new FileReader(path));

//			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String str1;
			System.out.println(br.readLine()); // 한줄 읽기

			// null이 아닐때까지 반복
			while ((str1 = br.readLine()) != null) {
				String[] arr1 = str1.split(",");

				Data data = new Data(arr1[0], arr1[1], arr1[2], arr1[3]);
				list1.add(data);

//				if (arr1.length >= 4) {
//
//					String name = arr1[0];
//					String age = arr1[1];
//					String mail = arr1[2];
//					String direction = arr1[3];

//					Data data = new Data(name, age, mail, direction);
//					list1.add(data);
//				}

			}

			for (Data data : list1) {
				System.out.println(data); // 데이터 출력하기
			}

//			for (int i = 0; i < list1.size(); i++) {
//				Data data = list1.get(i);
//				System.out.println(data.toString());
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
