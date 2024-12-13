package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] A = new int[n];

        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < A.length; i++){
            if(A[i] < m){
                System.out.print(A[i] + " ");
            }
        }

    }
}
