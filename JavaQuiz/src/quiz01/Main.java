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

//	String str = br.readLine();
//	bw.write(sum + "\n"); // 콘솔창에 띄우기
//  bw.flush(); // 남은거 비우기
//  br.close(); // 닫기

//클래스 이름이 Main 이여야 문제 오류 안남
public class Main {

	// main 메서드
	public static void main(String[] args) throws IOException { // 메인함수 예외발생 처리? 이게

		// 괄호안에다가 System.in으로 콘솔창에서 읽을건지, 파일로 읽는지 등 넣기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		int sum = 0;
		for (int i = 0; i <= t; i++) {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());

			sum = a + b;

		}

		bw.write(sum + "\n"); // 콘솔창에 띄우기
		bw.flush(); // 남은거 비우기
		br.close(); // 닫기
	}

}
