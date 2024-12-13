import java.util.Locale;

public class Main {
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
        // 1. - del
        String newStr = str.replace("-","");
        System.out.println("1 : "+newStr);
        //2 . Upper
        newStr = newStr.toUpperCase();
        System.out.println("2 : "+newStr);
        //3. k개로 파싱하기, 그리고 - 넣기
        // String 은 불변이여서 + 로 연결시켜줘야한다.
        //여기 문제가 보여야할게 많기 때문에 StringBuilder로 할게요
        StringBuilder sb = new StringBuilder(newStr);
        System.out.println("3 : "+newStr);
        //String 직접 쓰는거보단 조작하기가 편하다
        //-도 넣어야하기 때문에 조작을 해야한다.

        //for 돌리기 전에 길이를알아야 for 돌린다.
        //근데 여기서 8F3Z-2e-9-w => 8F3Z-2E9W
        //하는데 뒤에서 부터 넣잖아요?
        //0 1 2 3  4  5 6 7 8
        //8 F 3 Z "-" 2 E 9 W
        //앞에는 상관없다했고 뒤에서 가져와서 4번자리에 - 를 넣어줘야한다.
        //1. len = 8
        //2. 8 -k(4) = 4라는 이 로직을 이용해야겠죠?
        int len = sb.length();
        for(int i = k; i < len; i=i+k){
            System.out.println("len-i : "+(len-i));
            sb.insert(len-i,"-");
            System.out.println("4 : "+sb);
        }
        return sb.toString();
    }
}
