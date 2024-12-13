import java.util.ArrayList;
import java.util.List;

public class Solution4 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,2,3,6};
        System.out.println(solution.solution(arr));
    }

    public static class Solution {
        public double solution(int[] arr) {
            double sum = 0; // 초기화 sum

//            for(int i = 0; i < arr.length; i++){ // 배열에서 하나씩 꺼내서 sum에 저장
//                sum += arr[i];
//            }

            for (int i : arr){
                sum += i;
            }


            return sum / arr.length; // 평균값 구하기
        }
    }
}
