package baekjoon;

import java.util.Scanner;

public class Test {
    long sum(int[] a) {
        long b = 0;
        for(int i = 0; i < a.length; i++){
            b += a[i];
        }
        return b;
    }
}
