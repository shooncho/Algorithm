package inflearn.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array01 {
    public static void main(String[] args) {
        // ContainsDuplicate
        /*
        * 숫자로 구성된 배열이 주어졌을 때 그 배열에 중복된 숫자가 있는지
        * 확인하는 함수를 작성하라. 중복된 숫자가 있다면 true, 없다면 false
        *
        * ex) 1 2 3 4 5 6 => false
        * ex) 1 1 2 2 3 1 => true
        * 시간복잡도 : O(n^2)
        * 공간복잡도 : O(1)
        * */

        Array01 array01 = new Array01();
        System.out.println(array01.solution1(new int[] { 1, 2, 3, 4, 2, 5}));

    }

    private boolean solution1(int[] numbers) {
        for (int i = 0; i < numbers.length; i++){
            //j 는 순회하는거 다음에 돌면되기에 i + 1하면되는거겠죠?
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean solution2(int[] numbers) {
        Arrays.sort(numbers); // O(NlogN), O(logN)

        for(int i = 0; i < numbers.length - 1; i++) {
            // numbers.length -1 하는 이유는 우리는 아래에서
            // 다음꺼랑 비교할거기 때문에 outOfBoundIndex 피하기 위함
            if(numbers[i] == numbers[i+1]) {
                return true;
            }
        }

        return false;
    }

    /*
    * set 은 중복을 허용하지 않음
    * set은 hash값을 가지고 조회하기에 이거는 O(1)이예요
    * 여기서 중복된 값을 가질 수 없다.
    * 그리고 contains를 가지고 안에 들어있는 가지고 있는지 아닌지 확인 가능
    * */


    private boolean solution3(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();
        for (int num : numbers) {
            if(numberSet.contains(num)){
                return true;
            } else {
                numberSet.add(num);
            }
        }
        return false;
    }

}
