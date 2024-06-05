package _study;

public class study {
	public static void main(String[] args) {


		System.out.println(solution(1, 2, 3, 4));
		
	}
	
	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {}; 
        
            if(denom1 < denom2){
                answer[1] = 1/ 2;
                
            } else {
                answer[0] = denom1;
                
            }
            
        return answer;
    }
}
