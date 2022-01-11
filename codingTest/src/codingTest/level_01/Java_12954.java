package codingTest.level_01;

public class Java_12954 {

	
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        
        for(int i=0; i<n; i++){
            answer[i] += (long)x*(i+1);
        }
        
        return answer;
    }

}
