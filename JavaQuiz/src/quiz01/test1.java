package quiz01;

public class test1 {
	public static void main(String[] args) {

		String[] solution(int[] numbers, int[] our_score, int[] score_list) {
	        int num_student = numbers.length;
	        String[] answer = new String[num_student];

	        for (int i = 0; i < num_student; i++) {
	            if (our_score[i] == score_list[i]) {
	                answer[i] = "Same";
	            }
	            else {
	                answer[i] = "Different";
	            }
	        }

	        return answer;
	    }
	}

}