package baekjoon;

import java.sql.Array;
import java.util.*;

public class _10818 {
    public static void main(String[] args) {
        //N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = num;
        }
        Arrays.sort(arr);

        System.out.println(arr[arr.length-1] +" " +arr[0]);
    }
}
