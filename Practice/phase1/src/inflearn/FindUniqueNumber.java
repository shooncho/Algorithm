package inflearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindUniqueNumber {
    public static void main(String[] args) {
        FindUniqueNumber findUniqueNumber = new FindUniqueNumber();
        int result = findUniqueNumber.solution1(new int[]{1, 2, 2, 3, 3});
        System.out.println(result == 1);
    }

    /*
     * List를 만들고 배열에 있는 숫자를 순회하면서 해당 숫자가 List에 들어있는지 확인한다.
     * List에 들어있으면 List에서 빼내고, 없으면 넣는다.
     * 그럼 결과적으로 List에는 유일한 숫자만 들어있으니 해당 숫자를 꺼내서 리턴한다.
     * list.contains를 뽑는데 리스트를 전부 순회를 해야해요 그럼 저기에 for가 더 들어있죠 그래서
     * 시간 복잡도: O(n) * O(n) => O(n^2)
     * 공간 복잡도: O(n) 즉 리스트 만큼 배열을 만드니까
     * */
    private int solution1(int[] numbers) {
        List<Integer> list = new ArrayList<>();
//        for (int num = 1; num < numbers.length; num++) {
        for (int num : numbers){
            if (list.contains(num)) {
                list.remove(num);
            } else {
                list.add((Integer) num);
            }
        }
        return list.get(0);
    }

    /*
    * HashMap을 사용해서 배열에 들어있는 숫자를 키, 숫자의 등장 횟수를 값으로 저장한다.
    * 숫자의 등장 횟수가 1인 키 값을 찾아서 리턴한다.
    * HashMap에서 get할때 O(1) 입니다.
    * 시간복잡도 : O(n) + O(n) => O(2n) => O(n) 이되는 거예요
    * 공간복잡도 : O(n) 정확하게 인자인 int[]에 들어납니다.
    * */

    private int solution2(int[] numbers) {
        HashMap<Integer, Integer> numbersMap = new HashMap<>();

        for(int num : numbers) {
            numbersMap.put(num, numbersMap.getOrDefault(num, 0)+ 1);
        }

        for(int num : numbers) {
            if(numbersMap.get(num) == 1){
                return num;
            }
        }
        return  0;
    }

    /*
    * XOR 비트 연산자 (^)를 사용하는 방법
    * XOR 비트 연산자: 두 비트가 서로 다를 때 1
    * 5 ^ 0 = 5
    *
    * 101
    * 000
    * ---
    * 101 => 5
    *
    * 5 ^ 5 = 0
    *
    * 101
    * 101
    * ---
    * 000 => 0
    *
    * 1^ 5 ^ 1 = (1 ^ 1) ^ 5 = 0 ^ 5 = 5
    *
    * 시간 복잡도 : O(n)
    * 공간 복잡도 : O(n)
    * */

    private int solution3(int[] numbers) {
        int uniqueNum = 0;
        for (int num : numbers) {
            uniqueNum ^= num;
        }
        return uniqueNum;
    }
}
