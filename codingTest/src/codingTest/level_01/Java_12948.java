package codingTest.level_01;

public class Java_12948 {
	
    public String solution(String phone_number) {
        String answer = "";
        String number = phone_number.substring(phone_number.length()-4, phone_number.length());
        for(int i=0; i<phone_number.length()-4; i++) {
            answer += "*";
        }
        return answer + number;
    }
	
}
