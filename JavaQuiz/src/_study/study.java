package _study;

public class study {
	public static void main(String[] args) {

		System.out.println(solution(1, 2, 3, 4));

	}

	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {}; 
        
        1   3   4  6  10
        2   4   8  8   8s
        
            if(denom1 < denom2){
                int numer = (numer1 * denom2) + (numer2 * denom1); //분자 10
                int denom = (denom1 * denom2); //분모                     8
                
            } else if (denom1 > denom2){
                answer[0] = denom1;
                answer[1] = ;
            } else { //같은경우
            	answer[0] = numer1 +numer2;
            	answer[1] = denom1;
            }
        
        
        
            
        return answer;
    }
}
