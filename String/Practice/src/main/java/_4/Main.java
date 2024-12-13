package _4;

public class Main {
    public static void main(String[] args) {
        int[] digits = {9,0,0,9};
//        int[] digits = {9,9,9,9,9};

       int[] result = solve(digits);
       for(int i : result){
           System.out.println("val : "+i);
       }
    }

    public static int[] solve(int[] digits) {
        int n = digits.length; // 0,1,2,3 => 4개

        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
