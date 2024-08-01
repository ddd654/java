package day15.write_read;

import java.io.FileReader;

public class FileReader01 {
	public static void main(String[] args) {

		//이 파일에 있는 한글 글자 읽기

		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\Hello.txt";
		FileReader rd = null;

		try {
			rd = new FileReader(path);
			
			while(true)	{
				int word = rd.read();
				
				if(word == -1) {
					break;
				}
				
				System.out.println((char)word);
			}
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
