package day15.buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer_Reader {
	public static void main(String[] args) {

		// 입력

//		BufferedReader br = new BufferedReader("리더클래스")

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\apple.txt";
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(path));

//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());

			String str;
			while ((str = br.readLine()) != null) {
				// null이 나오면 끝나게하기
				System.out.println(str);

			}

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
