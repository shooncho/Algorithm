package programers;

public class Solution4 {
    public static void main(String[] args) {

        Solution4 solution4 = new Solution4();

        String phone_number = "01033334444";
        String phone_number1 = "027778888";

        System.out.println(solution4.solution4(phone_number1));
    }

    private String solution4(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int len = phone_number.length();

        for(int i = 0; i < len-4; i++){
            sb.append("*");
        }
        return sb.toString() + phone_number.substring(len-4, len);
    }

}
