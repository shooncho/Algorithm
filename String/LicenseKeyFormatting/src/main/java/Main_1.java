import java.util.Locale;

public class Main_1 {
    public static void main(String[] args) {
        //8F3Z-2e-9-w => 8F3Z-2E9W , k = 4
        // 1. - 를 없애기
        // 2. 대문자로 만들기
        // 3. K=4 로 문자열 나누기
        // 4. 나눈 문자열 사이 -(대쉬) 넣기
        //replace(), toUpperCase(), K=4로 문자열 나누기, 나눈 문자열 사이 - 넣기

        String str = "8F3Z-2E-9-wabcdef";
//        String str = "8F3Z-2e-9-w";
//        String str = "8-5g-3-J";
        int k = 4;
        System.out.println(solve(str, k));
    }

    private static String solve(String str, int k) {
      
    }
}
