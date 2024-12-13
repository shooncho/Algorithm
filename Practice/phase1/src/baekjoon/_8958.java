package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
//        System.out.println(str[0]);
//        System.out.println(Arrays.toString(str));

        //반복되는 O일때 숫자 증가 x만나면 초기화 그러면 2중 for 문으로 해야함
        for(int i = 0; i < str.length; i++){
            int cnt = 0;
            int sum = 0; // 담아줄 곳
            for(int j = 0; j < str[i].length(); j++){
                if(str[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt=0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }

    }
}
