package baekjoon;

public class _15596 {
    public static void main(String[] args) {
        Test test = new Test();
        int[] a = {123, 1,1};
        System.out.println(test.sum(a));
    }

    public static class Test {
        long sum(int[] a) {
            long b = 0;
            for(int i = 0; i < a.length; i++){
                b += a[i];
            }
            return b;
        }
    }

}


