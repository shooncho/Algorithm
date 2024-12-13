package programers;

//하샤드 수
public class Solution5 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        System.out.println(solution5.solution(113));

    }

//    private boolean solution(int x) {
//
//        String[] temp = String.valueOf(x).split("");
//
//        int sum = 0;
//
//        for(int i = 0; i < temp.length; i++){
//            sum += Integer.parseInt(temp[i]);
//        }
//
//        if(x%sum == 0){
//            return true;
//        } else {
//            return false;
//        }
//    }

    private boolean solution(int x) {

        int sum = 0;
        int a = x;
        while(a>0) {
            sum += a % 10;
            a = a / 10;
        }

        if(x%sum==0){
            return true;
        } else {
            return false;
        }
    }
}
