public class Main {
    public static void main(String[] args) {
        //문제 분석
        //1. 0 1 2 => 0 1 2 인덱스
        //   1 2 3    1 2 4
        //2. 0 1 2 => 0 1 2 3 인덱스
        //   9 9 9    1 0 0 0
        //3. 0 1 2 => 0 1 2 인덱스
        //   0 0 1 => 0 0 2
        // 뒷자리부터 체크 digits[2]+1,
        // 값이 10이되면 carry = 1로 1을 맨 앞자리에 추가
//        int[] digits = {1,2,3};
//        int[] digits = {9,9,9};
//        int[] digits = {9,8,9};
//        int[] digits = {8,9,9};
//        int[] digits = {0,0,1};
//        int[] digits = {0,0};
        int[] digits = {9,0,0,9};
//        int[] digits = {9,9,9,9,9};

        int[] result = solve(digits);
        for(int i : result){
            System.out.println("val : " + i);
        }
    }

    public static int[] solve(int[] digits){
        //우리는 끝을 알아야하니까 길이를 알아야겠죠??
        int n = digits.length; // 3

        for(int i = n - 1; i >= 0; i--){
            //2, 1, 0 번방 간다는거죠
            digits[i]++; //1,2,4 가 되겠죠
            //이때 값 자체가 10작으면 상관이없고
            if(digits[i] < 10){
                return digits;
            }
            //근데 9,9,9 에서 1들어가면 10 보다 크게 들어가면
            //이 값 자체에다가 0을 넣어주고여 별도의 배열을 만들어줘야해요
            digits[i] =0;
        }
        int[] result = new int[n+1]; // 0,0,0,0 4개가 들어가있는거죠
        result[0] = 1;

        return result;
    }
}
