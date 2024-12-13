package programers;

import java.util.Arrays;

//x만큼 간격이 있는 n개의 숫자
public class Solution2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(4, 3)));

    }
    static class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];

            int len = answer.length;

            for(int i = 0; i < len; i++){
                answer[i]  = (long)x * (i + 1);
            }
            return answer;
        }
    }
}
