package baekjoon;

import java.util.Scanner;

public class _4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        for(int i = 0; i < testcase; i++){

            int n = sc.nextInt(); // 학생 수
            int[] arr = new int[n];

            int sum = 0;

            for(int j = 0; j < arr.length; j++){
                int val = sc.nextInt();
                arr[j] = val;
                sum += val;
            }

            double mean = sum / n; // 전체 평균
            double cnt = 0;

            for(int j = 0; j < arr.length; j++){
                if(arr[j] > mean){
                    cnt++;
                }
            }

            System.out.printf("%.3f%%\n", (cnt/n)*100);
        }
    }
}
