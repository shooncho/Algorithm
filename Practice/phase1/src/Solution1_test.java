import java.util.Arrays;

public class Solution1_test {
//    행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
//    2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
//    행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] A = {{1,2}, {2,3}, {1,1}};
        int[][] B = {{3,4}, {5,6},{1,1}};
        int[][] answer = solution.solution(A,B);
        System.out.println(Arrays.deepToString(answer));
    }
    public static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = {};
            answer = arr1;
            for(int i = 0; i < answer.length; i++){
                for(int j = 0; j < answer[i].length; j++){
                    //answer[i].length는 answer의 각 배열 요소인 1차원 배열이
                    // 가지고 있는 배열 요소의 총 개수를 반환
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            return answer;
        }
    }
}
