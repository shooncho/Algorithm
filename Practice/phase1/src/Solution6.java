public class Solution6 {
    public static void main(String[] args) {

    }

    public static class Solution {
        public int[] solution(int n, int m) {
            int max = Math.max(n,m);
            int min = Math.min(n,m);

            //최대 공약수
            //유클리드 호제법 : a를 b로 나눈 나머지를 r이라 하면 (a>b) a,b의 최대 공약수는 b와 r의 최대공약수와 같다.
            while(min != 0) {
                int r = max % min;
                max = min;
                min = r;
            }

            int gcd = n * m / max;

            int[] answer = {max, gcd};
            return answer;
        }
    }
}
