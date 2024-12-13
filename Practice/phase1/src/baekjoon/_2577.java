package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int temp = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String str = String.valueOf(temp);

        for(int i = 0; i < 10; i++){
            int count = 0;
            for(int j = 0; j < str.length(); j++) {
                if((str.charAt(j)-'0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
