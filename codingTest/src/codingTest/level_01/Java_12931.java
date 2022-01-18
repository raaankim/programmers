package codingTest.level_01;

public class Java_12931 {
	public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        for(int i=0; i<num.length(); i++) {
            answer += num.charAt(i) - '0';
        }
        
        return answer;
    }
}
