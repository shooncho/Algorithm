package programers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    //293을 입력받아서 twoninethree
    public static void main(String[] args) {
        test test = new test();
        System.out.println(test.t(293));
    }
//    private String t (String n){
//        String[] str = {"zero", "one","two","three","four","five","six","seven","eight","nine"};
//        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
//
//        for(int i = 0; i < str.length; i++){
//            n = n.replace(num[i], str[i]);
//        }
//        String answer = String.valueOf(n);
//        return answer;
//    }

    private String t (int n){
        String[] str = {"zero", "one","two","three","four","five","six","seven","eight","nine"};
        List<String> result= new ArrayList<String>();

        while(true) {
            int r = n % 10;
            n /= 10;

            result.add(str[r]);
            if(n / 10 == 0) {
                result.add(str[n]);
                break;
            }
        }
        String answer = "";

        for(int i = result.size() - 1; i >= 0; i--) {
            answer += result.get(i);
        }

        return answer;
    }

}
