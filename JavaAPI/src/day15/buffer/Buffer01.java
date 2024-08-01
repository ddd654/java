package day15.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Buffer01 {
	public static void main(String[] args) {

		// Buffer

		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\Hello3.txt";

		BufferedOutputStream bo = null;
		BufferedInputStream bi = null;

		try {
//			os = new FileOutputStream(path);
//			BufferedOutputStream bf = new BufferedOutputStream(os);

			// 한번에 한줄로 쓰기
			bo = new BufferedOutputStream(new FileOutputStream(path));
			bi = new BufferedInputStream(new FileInputStream(path));

			String str = "Hello world";
			
			

//			bf.write(str.getBytes(), 0, str.length());
			
			bo.write(str.getBytes());

			bo.flush();
			
			////
			//데이터 읽음
			
			while(true) {
				int word = bi.read();
				
				if(word == -1)break;
				
				System.out.println((char)word);
			}
			
			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} finally {
			
			try {
				bo.close();
				bi.close();
			} catch (Exception e2) {
				
			}
			
			
			
		}

	}
}
