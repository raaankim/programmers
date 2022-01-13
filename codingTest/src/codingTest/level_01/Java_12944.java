package codingTest.level_01;

public class Java_12944 {

	class Solution {
	    public double solution(int[] arr) {
	        double answer = 0;
	        int sum = 0;
	        
	        for(int i=0; i<arr.length; i++) {
	            sum += arr[i];
	        }
	        
	        answer = (double)sum/arr.length;
	        return answer;
	    }
	}
}
