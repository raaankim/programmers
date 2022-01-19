package codingTest.level_01;

public class Java_12932 {
	public int[] solution(long n) {
        
        String str1 = String.valueOf(n);
        String str2 = "";
        for(int i=str1.length()-1; i>=0; i--){
            str2 += str1.charAt(i);
        }
        char[] arr = str2.toCharArray();
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
             answer[i] += arr[i] - '0';
        }
        
        return answer;
    }
}
