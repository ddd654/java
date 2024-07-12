package _study;

public class Quiz_lamb_skewers {
	public static void main(String[] args) {
		
		System.out.println(solution(10, 3));
	}
	
	public static int solution(int n, int k) {
        int answer = 0;
        //n 당 12000, k당 2000
        
        answer += n * 12000;
        answer += k * 2000;
        
        //서비스음료
        int a = n / 10;
        
        //서비스 음료만큼 답에서 빼기
        answer -= a * 2000;
        
        
        
        
        return answer;
    }
}
