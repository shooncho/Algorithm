package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class _2562 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println(max + " " + index);
    }
}
