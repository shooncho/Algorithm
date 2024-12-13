package baekjoon;

import java.util.Scanner;

public class _10951 {
    public static void main(String[] args) {
        //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(0 > n || m > 10){
                break;
            }
            System.out.println(n+m);
        }
    }
}
