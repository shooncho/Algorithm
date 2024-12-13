package _3;

public class Main {
    public static void main(String[] args) {

        String s = "8F3Z-2E-9-wabcdef";
        int k = 4;

        System.out.println(solve(s, k));
    }

    private static String solve(String s, int k) {
        //1. - del
        String newStr =s.replace("-","");
        System.out.println("1 : " + newStr);

        //2. Upper
        newStr = newStr.toUpperCase();
        System.out.println("2 : "+ newStr);

        //3. k로 나누고 - 넣기
        StringBuilder sb = new StringBuilder(newStr);
        System.out.println("3 : " + sb);

        int len = sb.length();
        for(int i = k; i < len; i=i+k){
            System.out.println("len -i : "+(len-i));
            sb.insert(len-i,"-");
            System.out.println("4 : "+sb);
        }
        return sb.toString();
    }
}
