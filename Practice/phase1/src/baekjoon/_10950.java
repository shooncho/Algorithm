package baekjoon;

import java.util.Scanner;

public class _10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b,c = 0;

        for (int i = 0; i < a; i++){
            b = sc.nextInt();
            c = sc.nextInt();

            System.out.println(b + c);
        }
    }
}
