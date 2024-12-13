package _2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";

        System.out.println(solve(jewels, stones));
    }

    private static int solve(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        char[] jewArr = jewels.toCharArray();
        for(int i = 0; i < jewArr.length; i++){
            set.add(jewArr[i]);
        }

        int count = 0;
        char[] stoneArr = stones.toCharArray();
        for(int i = 0; i < stoneArr.length; i++){
            if (set.contains(stoneArr[i])){
                count++;
            }
        }
        return count;
    }
}
