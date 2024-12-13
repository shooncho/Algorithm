import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Solution1 {
//    행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
//    2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
//    행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] A = {{1,2}, {2,3}, {1,1}};
        int[][] B = {{3,4}, {5,6}, {1,1}};
        int[][] answer = solution.solution(A,B);
        System.out.println(Arrays.deepToString(answer));
    }
    public static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = {};
//            int[][] answer = new int[arr1.length][arr2.length];
            answer = arr1; // 2차원배열 arr1로 초기화

            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j< arr1[i].length; j++){
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            return answer;
        }
    }
}
