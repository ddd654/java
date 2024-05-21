package day09.encap.data;

public class MainClass {
	public static void main(String[] args) {
		
		//멤버 객체 2개 만들기
		Member m = new Member("홍길동", 22, "naver", "seoul","010");
		
		Member m2 = new Member();
		
		m2.setName("사과");
		m2.setAge(0);
		m2.setEmail("naver");
		m2.setAddr(null);
		m2.setPhone(null);
		
//		String[] arr = new String[]	{"~", "WW"};
		Member[] arr = new Member[2];
		arr[0] = m;
		arr[1] = m2; 
		
		//객체배열의 순외
		for(int i=0; i < arr.length i++) {
			Member member = arr[i];
			System.out.println(member.getName());
			System.out.println(member.getAge());
		}
	}

}
