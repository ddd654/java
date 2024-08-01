package quiz01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//문제 제출할때, import도 필요

// Lv.0 간단
// Lv.1 배열
// Lv.2 자료구조
// Lv.3 부터 알고리즘 필요 - ex 경우의 수

//
// Car car = new Car();
// car는 인스턴스이다
// car는 객체이다
// car는 Car의 인스턴스이다
// car는 Car의 객체이다.

//
//public static void main(String[] args) throws IOException { //메인함수 예외발생 처리? 이게 뭐지
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	
//  int로 형변환 하는법
//  int a = Integer.parseInt(br.readLine());

//	원래 String 형이다
//	String str = br.readLine();
//	bw.write(sum + "\n"); // 콘솔창에 띄우기
//  bw.flush(); // 남은거 비우기
//  br.close(); // 닫기

//클래스 이름이 Main 이여야 문제 오류 안남
public class Main_BufferedReader {

	// main 메서드
	public static void main(String[] args) throws IOException { // 메인함수 예외발생 처리? 이게

		// 괄호안에다가 System.in으로 콘솔창에서 읽을건지, 파일로 읽는지 등 넣기
		// 스캐너처럼 틀만들기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// String으로 read하고 int로 변환한다

		int t = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < t; i++) {
			//공백을 구분
			st = new StringTokenizer(br.readLine()," ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			bw.write(a + b + "\n"); // 입력 하기, \n 줄바꿈이다

		}
		bw.flush(); // 콘솔창에 띄우기, 위에랑 같이
		br.close(); // 닫기
	}

}
