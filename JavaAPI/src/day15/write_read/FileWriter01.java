package day15.write_read;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriter01 {
	public static void main(String[] args) {

		//문자를 써서 저장하는 클래스 FileWriter
		//2바이트 단위로 처리하기에 한글이 적합
		
		Writer rw = null;
		
		//여기에 문자쓰기
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\Hello.txt";
		
		try {
			rw = new FileWriter(path);
			
			rw.write("맛있는\n사과"); // 문자를 바로 쓸 수 있음
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
