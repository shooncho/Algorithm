package inflearn.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array03 {
    public static void main(String[] args) {
        /*
        * 배열 순회 및 출력
        * HashMap의 오퍼레이션을 이해하고 있는가?
        * 2Sum 문제를 3Sum 문제로 바꿔도 해결할 수 있을까?
     문제 3 두 수의 합
     숫자로 구성된 배열 numbers와 target 숫자 하나가 주어졌을 때 numbers 배열에
     들어있는 두 수를 더해 target 숫자를 만들 수 있는 인덱스 두개를 찾는 함수를 작성하라.

     예) numbers = [2, 3, 5, 7] target = 8, 8을 만들 수 있는 3과 5의 인덱스인 1,2를 리턴해야한다.
     예) numbers = [1, 2, 6, 8] target = 9, 9를 만들 수 있는 1과 8의 인덱스인 0,3을 리턴해야한다.

     numbers 배열에 중복되는 숫자는 없으며 target숫자를 만들 수 있는 조합은 하나 뿐이라고 가정해도 좋다.

        * */
        //TwoSumSolutions twoSumSolutions = new TwoSumSolutions();
        Array03 array03 = new Array03();
//        int[] result = array03.solution1(new int[]{2, 3, 5, 7}, 9);
        int[] result = array03.solution2(new int[]{2, 3, 5, 7}, 9);
//        int[] result = array03.solution2(new int[]{2, 3, 4 , 7}, 6);
        System.out.println(Arrays.toString(result));
    }

    private int[] solution2(int[] numbers, int target) {

        // 시간 O(N), 공간복잡도는 Map을 하나 더 만들었으니까 O(N)이 되는거죠

        //2 3 5 7 이 있는데 순회해서 9를 찾아야하죠
        //찾아야할 넘버를 알아요 2+ x = 9 , x = 7 이잖아요
        //만약에 map을 가지고 있다하죠 2는 0 , 3은 1, 5는 2, 7은 3
        // 키 밸류 맵에 보이죠?? 2를 알고있죠 그러면 우리는 map에 7이있나 없나 보면되는거죠
        // 그러면 들고있는 2와 7이 담겨있는 이 인덱스를 꺼내서 밸류로 리턴하면되겠죠
        // 그럼 loop를 한번만 돌죠

        //Map 시간 복잡도는 채우느라 O(n)
        Map<Integer,Integer> numberMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            numberMap.put(numbers[i], i); // 값을 키로 넣고 밸류에 인덱스를 넣을거예요 그럼 테이블 대로 들어가죠??
        }

        //2 3 4 5, 6,, 3을 중복해서 2번꺼내면 안되기때문에 그 경우를 피할려면
        //Map에 get하건 뭐 찾곤 결국 O(1) 인데 for 문 하나니까 O(n)
        for (int i = 0; i < numbers.length; i++) {
            int numberToFind = target - numbers[i]; //찾아야하는 넘버 즉 9 - i번째 값인거죠
            if(numberMap.containsKey(numberToFind) && numberMap.get(numberToFind) != i){
                //키로 가지고 있다면?? 그리고 인덱스가 동일하면 안돼요
                return  new int[] {i, numberMap.get(numberToFind)};
            }
        }
        return null;
    }

    private int[] solution1(int[] numbers, int target) {
        //시간 O(n^2) 공간 : 들어가는게 O(1) 지정되어있으니까
        //itar 하면 자동으로 만들어줌
        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // 하나돌고 다음꺼 돌아서 확인해야하니까
                if(numbers[i] + numbers[j] == target){
                    //i번째랑 j 번째가 target이되면 리턴하면된다.
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    //시간 O(n)

    // 2SUM을 3SUM으로 한번 풀어보기
}
