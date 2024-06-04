package day15.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStream01 {
	public static void main(String[] args) {

		// Input이 붙어있는 클래스는 1바이트 기반의 입력스트림 클래스이다

		// 1. 파일을 읽을때 FileInputStream

		String path = "C:\\\\Users\\\\user\\\\Desktop\\\\course\\\\java\\\\upload\\\\Hello.txt";

		InputStream ios = null;

//		try {
//			ios = new FileInputStream(/*"읽을 파일 경로"*/path);
//			
//			
//			while(true) {
//				int data = ios.read();
//				
//				if(data == -1) {
//					break;
//				}
//				
//				System.out.println(data); //글을 다 읽으면 -1이 나온다
//				System.out.print((char)data); //영어는 깨지지않고 잘 나옴
//			}
//			
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}

		byte[] arr = new byte[100];

		try {
			int length = ios.read(arr);

			System.out.println("데이터 길이" + length);

			//
			int i = 0;
			while (i < length) {
				System.out.println((char) arr[i]);
				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ios.close();

			} catch (Exception e) {

			}

		}

	}
}
