package inflearn.array;

import java.util.Arrays;

public class Array04 {
    public static void main(String[] args) {
        /*
        *
         문제4. O(n) 정렬
         1부터 100까지의 숫자 중에 50개의 랜덤한 숫자가 들어있는 배열이 있다.
         이 배열을 O(n)의 시간복잡도로 정렬하라.
        * */

        // 2, 5, 9 ,7 을 정리해야하는데
        // 인덱스가 0~ 11까지 있어요 그러면 이거를 2,5,7,9 해당 인덱스에 넣고
        // 이 배열을 순회하면서 값이 들어있는 그 인덱스만 다시 추리는거예요
        // 그럼 2,5,7,9가 되는거죠??
        // 입력값 자체가 랜덤한 숫자
        // 배열의 크기는 우리 Integer 까지로하기때문에 21억 언저리로 충분히 커버하는 숫자죠
        // 값도 다 양수, 100가지니까 충분합니다.
        //SortByArray sortByArray = new SortByArray();
        Array04 array04 = new Array04();
        System.out.println(Arrays.toString(array04.solution(new int[]{2, 4, 1 ,5 ,6, 9})));
    }

    private int[] solution(int[] numbers) {
        //배열 만들기
        boolean[] booleans = new boolean[100];
        //배열에 넣기
        //iter -> foreach
        for (int num : numbers) {
            booleans[num] = true;
        }

        //true 면 배열에 담아줘야겠죠??
        int index = 0;
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i]) {
                numbers[index++] = i;
            }
        }
        return numbers;
    }
}
