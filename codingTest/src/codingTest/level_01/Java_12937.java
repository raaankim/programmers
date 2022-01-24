package codingTest.level_01;

public class Java_12937 {
	
    public String solution(int num) {
        String answer = "";
        int n = Math.abs(num);
        if(n%2 == 1){
            answer = "Odd";
        }else {
            answer = "Even";
        }
        return answer;
    }
	

}
