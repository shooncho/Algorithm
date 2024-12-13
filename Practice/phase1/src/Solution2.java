public class Solution2 {

    //phonenumber에 뒷 부분 4자리 빼고 * 표시
    public static void main(String[] args) {
        Solutuon solutuon = new Solutuon();
//        String phoneNumber = "01033334444";
        String phoneNumber = "010333444";

        System.out.println(solutuon.solution(phoneNumber));
    }

    public static class Solutuon {
        public String solution(String phone_number) {
            StringBuilder sb = new StringBuilder(); // 문자를 새로 만들어줘야하니까 StringBuilder로 선언
            int len = phone_number.length(); // 길이 담아두고
            for(int i = 0; i < len-4; i++){ // for 문으로 뒷자리 4개전까지만 반복 실행
                sb.append("*"); // 그 앞에는 *로 담아두고
            }

//            return sb.toString()+phone_number.substring(len-4, len); // 담아둔 상태를 toString()으로 뽑아서 뒷자리 출력
            return sb.toString()+phone_number.substring(len-4, len);
        }
    }
}
