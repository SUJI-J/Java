import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                cnt++;
            }
        }
        
        if (cnt == 0) {
            int[] answer = new int[]{-1};
            return answer;
        } else {
            int[] answer = new int[cnt];
            int idx = 0;
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    answer[idx] = arr[i];
                    idx++;
                }
            }

            Arrays.sort(answer);
            return answer;
        }
    }
}