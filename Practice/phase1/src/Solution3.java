public class Solution3 {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(13));
    }

    public static class Solution {
        public boolean solution(int x) {
            String[] temp = String.valueOf(x).split(""); // String.valueOf(x)로 String으로 치환해서 혹시 모를 구분자 체크를위해 split
            // String.valueOf() - 파라미터가 null이면 문자열 "null"을 만들어서 반환
            // toString() - 대상 값이 null이면 NullPointError 발생하고 Object에 담긴 값이 String이 아니여도 출력한다.
            int sum = 0;
            for(String s : temp){ // temp 배열에서 꺼내서 s에 넣는데 그걸 Integer.parseInt(s) 숫자로 변경하여 sum 에 저장
                sum += Integer.parseInt(s);
            }

            if(x % sum == 0) { // x랑 sum 나머지가 0이면 true, 반대면 false
                return true;
            }else{
                return false;
            }
        }
    }
}
