package test;

import java.util.HashSet;
import java.util.Set;

public class Main_2 {
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
        Main_2 a = new Main_2();
        String[] emails = {
                "test.email+james@coding.com",
                "test.e.mail+toto.jane@cod.ing.com",
                "testemail+tom@cod.ing.com"};
//        String[] emails = {
//                "test.email+james@coding.com"};
        System.out.println(a.solve_1(emails));
        System.out.println(a.solve_split(emails));
    }


    private int solve_1(String[] emails) {
        //수정된 문자가 들어오면 갯수개를 카운터를 하는거예요
        //set은 중복을 제거하고 고유한것만 담게 되기때문에
        Set<String> set = new HashSet<>();
        for(String email : emails) {
            //String 에 대한 조작을 charAt()으로 한다.
            String localName = makeLocalName(email);
            String dName = makeDName(email);

            set.add(localName+"@"+dName);
        }
        return set.size();
    }

    private String makeDName(String email) {
        return email.substring(email.indexOf("@")+1);
    }

    private String makeLocalName(String email) {
        //새롭게 만들어지니까
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i <email.length(); i++){
            if(email.charAt(i) == '.'){
                continue;
            }
            if(email.charAt(i) == '+' || email.charAt(i)=='@') {
                break;
            }
            sb.append(email.charAt(i));
        }
        return sb.toString();
    }

    private int solve_split(String[] emails) {
        Set<String> set = new HashSet<>();

        for(String email : emails) {
            String[] parts = email.split("@");
            String[] localName= parts[0].split("\\+");
            set.add(localName[0].replace(".","")+"@"+parts[1]);
        }
        return set.size();
    }

}
