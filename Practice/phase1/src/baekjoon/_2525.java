package baekjoon;

import java.util.Scanner;

public class _2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        //전부 다 분으로 변경하고
        int test = (A * 60) + B + C;
        A = test/60; // 시
        B = test%60; // 분

        //만약 시간이 24시간이 넘는다면 0으로
        if(A >= 24 ) {
            A = A - 24;
        }
        System.out.println(A + " " + B);
    }
}
