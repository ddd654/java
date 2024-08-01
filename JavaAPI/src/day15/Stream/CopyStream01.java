package day15.Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyStream01 {
	public static void main(String[] args) {

		// 파일 읽고 복사하기
		
		// input, outputstream 클래스는 1바이트 기반으로 파일을 읽고 쓰는데 적합하다

		String inputpath = "C:\\Users\\user\\Desktop\\course\\java\\upload\\123.png";
		String outputpath = "C:\\Users\\user\\Desktop\\course\\java\\upload_copy\\copy.png";

		InputStream ios = null;
		OutputStream fos = null;

		try {
			ios = new FileInputStream(/* "경로" */inputpath);
			fos = new FileOutputStream(outputpath);

			// 파일 읽기
			byte[] arr = new byte[1000]; // 1000바이트씩 읽기

			// 반복문으로 몇번 읽기

			int result;
			while ((result = ios.read(arr)) != -1) { // 더이상 읽을 내용이 없으면 -1을 반환한다

				// 파일 output
				fos.write(arr, 0, result); // 배열의 데이터 길이인 result 까지 파일을 쓴다

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				ios.close();
				fos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}
}
