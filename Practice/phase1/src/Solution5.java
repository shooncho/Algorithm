public class Solution5 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(626331));
    }

    static class Solution {
        public long solution(int num) {
            int answer = 0;

            long longNumber = num;
            while (longNumber!=1) {
                if(answer == 500){
                    answer = -1;
                    break;
                }
                if(longNumber == 1){
                    answer = 0;
                    break;
                }
                if(longNumber%2==0){
                    longNumber = longNumber / 2;
                } else {
                    longNumber = (longNumber * 3) + 1;
                }
                answer++;
            }
            return answer;
        }
    }
}
