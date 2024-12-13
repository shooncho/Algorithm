package test;

import java.util.HashSet;
import java.util.Set;

public class Main_1 {
    public static void main(String[] args) {
//        1. 보석은 대소문자를 구분해서 갖고 있어야한다.
//        2. aA -> 2개
//        3. 보석과 저장한다 set
//        4. Stone을 for문 루프
//        5. Set에 있는 값과 비교해서 count

          String jewels = "aA", stones = "aAAbbbb";
//        String jewels = "zz", stones = "ZZ";
        System.out.println(solve(jewels,stones));
    }

    public static int solve(String jew, String stones){
        Set<Character> set = new HashSet<>();

        char[] charArr = jew.toCharArray();
        for(int i = 0; i < charArr.length; i++){
            set.add(charArr[i]); // a, A 일단 보석은 담은 상태
        }

        char[] stoneArr = stones.toCharArray();
        int count = 0;
        for(int i = 0; i < stoneArr.length; i++){
            if(set.contains(stoneArr[i])) {
                count++;
            }
        }
        return count;
    }
}
