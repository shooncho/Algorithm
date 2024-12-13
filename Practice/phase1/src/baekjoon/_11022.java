package baekjoon;

import java.util.Scanner;

public class _11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        for(int i = 1; i <= num1; i++){
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            System.out.println("Case #" + i + ": " + num2 + " + " + num3 + " = " + (num2+num3));
        }
    }
}
