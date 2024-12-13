import java.util.ArrayList;
import java.util.Arrays;

public class Solution8 {
    public static void main(String[] args) {

    }

    //  배열 arr 에서 가장 작은 수를 제거한 배열을 리턴
    // 빈 배열인 경우 -1로 채워서 리턴
    // [4,3,2,1] [4,3,2] ,,, [10] -> [-1]
    public static class Solution {
        public int[] solution(int[] arr) {
            int[] temp = arr.clone(); //복사
            Arrays.sort(temp); // 정렬
            int min = temp[0]; //첫번째가 젤 작음

            ArrayList<Integer> list = new ArrayList<>();

            for(int i = 0; i < arr.length; i++){
                if(arr[i]!=min){
                    list.add(arr[i]);
                }
            }

            int[] answer = {};

            if(list.size() == 0){
                answer = new int[1];
                answer[0] = -1;
            } else {
                answer = new int[list.size()];
                for (int i =0; i < list.size(); i++){
                    answer[i] = list.get(i);
                }
            }

            return answer;
        }
    }
}
