package codingTest.level_01;

public class Java_12919 {
	public String solution(String[] seoul) {
        String answer = "";
        int kim = 0;
        
        for( int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                kim = i;
            }
        }
        
        answer = "김서방은 " + kim + "에 있다";
        return answer;
    }
}
