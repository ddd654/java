package day15.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Beffer_Writer {
	public static void main(String[] args) {

		// BufferedWriter 클래스
		// 문자열 2바이트기반의 성능 향상 보조 스트림
		// 빠른 출력에 사용

		// 출력빠르게 하기
//		Writer w = new OutputStreamWriter(System.out);
//
//		BufferedWriter bw = new BufferedWriter(new BufferedWriter(w));
//
//		bw.write("안녕하세요");
//		bw.flush();
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\apple.txt";
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(path));
			
			bw.write("안녕\n사과");
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				bw.close();
			} catch (Exception e2) {
					
				
			}
			
			
		}
		
		

	}
}
