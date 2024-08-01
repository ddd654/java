package day13.api.lang.buffer;

public class Buffer {
	public static void main(String[] args) {
		//빠른문자열
		
		String str = new String("java");
		StringBuffer sb = new StringBuffer("java");
		
		System.out.println(str);
		System.out.println(sb);
		
		//
		str = str + "bye~";
		sb.append("bue~");
		
		System.out.println(str);
		System.out.println(sb);
		
		//중간에 추가
		sb.insert(4, "hello ");
		System.out.println(sb);
		
		//
		//문자열이 변경됨
		sb.replace(4, 10, "good");
		System.out.println(sb);
		
		//문자열 삭제	
		sb.delete(0, 0);
		System.out.println(sb);
		
		//문자열 뒤집기
		sb.reverse();
		System.out.println(sb);
		
		sb.reverse(); // 다시 뒤집기
		
		//빠른문자열을 문자열로 형변환
		
		String s = sb.toString();
		
		if(s.equals("java")){
			System.out.println("123");
		}
		
		
		
	}
}
