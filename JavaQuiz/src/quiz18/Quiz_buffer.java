package quiz18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_buffer {
	public static void main(String[] args) {

		// 빠른 입력으로 입력받기
		// 그만을 적을때까지 받기
		// 입력받은 내용을 BufferWriter로 파일을 쓰세요
		// 엔터를 칠때마다 데이터가 써저야함
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new FileWriter(null));

		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\apple3.txt";

		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {

			br = new BufferedReader(new InputStreamReader(System.in)); //시스템 입력을 읽는다
			bw = new BufferedWriter(new FileWriter(path)); // 파일에 쓴다

			while (true) {

				String a = br.readLine();
				bw.write(a + "\n"); //파일에 쓰기

				if (a.equals("그만")) {
					System.out.println("끝");

					break;
				}
				

			}
			bw.flush();

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}

	}
}
