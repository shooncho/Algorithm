package baekjoon;

import java.util.Random;
import java.util.Scanner;

public class _2480 {
    public static void main(String[] args) {
        /*
        * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

        같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
        예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
        또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
        3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

        3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
        * */

        Scanner sc = new Scanner(System.in);

//        Random random = new Random();
//        int dice1 = random.nextInt(6) + 1;
//        int dice2 = random.nextInt(6) + 1;
//        int dice3 = random.nextInt(6) + 1;

        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();


        int result = 0;
        if(dice1 == dice2 && dice2 == dice3 && dice1 == dice3) {
//            System.out.println(10000+(dice1*1000));
            result = 10000+(dice1*1000);
        } else if (dice1 == dice2 || dice1 == dice3) {
//            System.out.println(1000 + (dice1*100));
            result = 1000 + (dice1*100);
        } else if (dice2 == dice3) {
//            System.out.println(1000 + (dice2*100));
            result = 1000 + (dice2*100);
        } else {
//            System.out.println(Math.max(dice1, Math.max(dice2, dice3))*100);
            result = Math.max(dice1, Math.max(dice2, dice3))*100;
        }

        System.out.println(result);
    }
}
