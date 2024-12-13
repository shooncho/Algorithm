package baekjoon;

import java.util.Scanner;

public class _2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num%4==0){
            if(num%400==0){
                System.out.println("1");
            } else if(num%100==0){
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }else {
            System.out.println("0");
        }
    }

    private boolean LeapYear() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num%4==0){
            if(num%100==0 && num%400==0){
              return true;
            }
        }else {
            return false;
        }
        return false;
    }
}
