package codingTest.level_01;

import java.util.Arrays;

public class Java_12917 {
	public String solution(String s) {
        String answer = "";
        char[] str = s.toCharArray();
        Arrays.sort(str);
        
        char[] reverse = new char[str.length];
        
        for (int i = str.length - 1; i >= 0; i--) {
            answer += str[i];
        }
        return answer;
    }
}
