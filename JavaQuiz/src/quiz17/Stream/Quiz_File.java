package quiz17.Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Quiz_File {
	public static void main(String[] args) {

		// 1. 스캐너로 확장자까지 파일명 입력받기

		// 2. upload 폴더에 있는 파일을 uploadcopy로 복사
		// 파일이 없으면 "파일명이 없습니다" 예외구문 출력

		Scanner scan = new Scanner(System.in);

		System.out.println("복사할 파일");
		String a = scan.nextLine();
		System.out.println("복사할 파일의 새로운 이름");
		String OutFileName = scan.nextLine();

		String inPath = "C:\\Users\\user\\Desktop\\course\\java\\upload\\" + a;
		String outPath = "C:\\Users\\user\\Desktop\\course\\java\\upload_copy\\" + OutFileName;

		InputStream in1 = null;
		OutputStream out1 = null;

		try {

			in1 = new FileInputStream(inPath);
			out1 = new FileOutputStream(outPath);

			//
			byte[] arr1 = new byte[10000];

			int result;

			while ((result = in1.read(arr1)) != -1) {
				out1.write(arr1, 0, result);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				in1.close();
				out1.close();
			}catch (Exception e) {
				// TODO: handle exception
				
			}
			
			
			
		}

	}
}
