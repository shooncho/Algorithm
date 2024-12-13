package test;

import java.util.HashSet;
import java.util.Set;

public class Main_1 {
    public static void main(String[] args) {
        //문제 분석
        //1. 로컬네임 + 도메인네임
        //2. 로컬네임에서는 . 무시한다
        //3. 로컬네임에서 + 이후로 나오는 문자열은 무시한다
        //4. 도메인네임에서 .이 들어가면 고유하다

        // 규칙찾기 test.email+james
        // 1. . => Continue로 뺀다
        // 2. + => break로 뺀다
        // 3. Set<String>
        // replace, subString 사용
        Main_1 a = new Main_1();
        String[] emails = {
                "test.email+james@coding.com",
                "test.e.mail+toto.jane@cod.ing.com",
                "testemail+tom@cod.ing.com"};
//        String[] emails = {
//                "test.email+james@coding.com"};
        System.out.println(a.solve_1(emails));
        System.out.println(a.solve_split(emails));
    }

    //1. basic
    public int solve_1(String[] emails) {
        Set<String> set = new HashSet<>(); // 중복 x 되는 걸 담는 공간

        for(String email : emails){
            //"test.email+james@coding.com" @ 기준으로 담아줄거지
            String LocalName = makeLocalName(email);
            String DName = makeDName(email);

            set.add(LocalName+"@"+DName);
        }
        return set.size(); // 개수 반환
    }

    private String makeDName(String email) {

        return email.substring(email.indexOf("@") +1);
    }

    private String makeLocalName(String email) {
        StringBuilder sb = new StringBuilder(); // String 담을 공간

        for (int i = 0; i < email.length(); i++){

            if(email.charAt(i) == '.'){
                continue;
            }
            if(email.charAt(i) == '+' || email.charAt(i) == '@'){
                break;
            }
            sb.append(email.charAt(i));
        }
        return sb.toString();
    }

    //3. solve_split
    public int solve_split(String[] emails) {
        Set<String> set = new HashSet<>();

        for(String email : emails){
            String[] parts = email.split("@");
            String[] localName = parts[0].split("\\+");
            set.add(localName[0].replace(".","")+"@"+parts[1]);
        }
        return set.size();
    }

}
