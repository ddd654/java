package quiz14;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz01_StringTokenizer {
	public static void main(String[] args) {

		
		// 입력한 문장을 토큰나이저로 분리, 공백으로
		// 토큰 개수 출력
		// 토큰에 숫자 붙이기
		
	
		Scanner scan = new Scanner(System.in);

		String str1 = scan.nextLine();

		StringTokenizer token = new StringTokenizer(str1, " ");

		System.out.println("개수: " + token.countTokens());
		
		String[] arr = new String[token.countTokens()];
		
		int i = 0;
		while(token.hasMoreTokens()) {
			
			String word = token.nextToken();
			
			System.out.println( (i+1)+ ". " + word);
			arr[i] = word;
			
			
			i++;
		}
		
		System.out.println(Arrays.toString(arr));
		
//		
//		for(int i = 1; i <= token.countTokens() ; i++) {
//			System.out.println(i + "." + token.nextToken());
//		}
		
		
		

	}
}
