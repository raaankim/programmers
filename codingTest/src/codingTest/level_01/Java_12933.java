package codingTest.level_01;

import java.util.Arrays;
import java.util.Collections;

public class Java_12933 {
	public long solution(long n) {
        long answer = 0;
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        answer = Long.parseLong(String.join("", arr));
        
        return answer;
    }
}
