package programers;

//평균 구하기
public class Solution6 {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        int[] arr = {1,2,3,4};
        System.out.println(solution6.solution(arr));
    }

    private double solution(int[] arr) {
        double sum = 0;
        int len = arr.length;
        for(int i = 0; i < len; i++){
            sum += arr[i];
        }

        return sum / arr.length;
    }
}
