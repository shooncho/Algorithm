import java.util.HashSet;
import java.util.Set;

public class Main {
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
        Main a = new Main();
        String[] emails = {
                "test.email+james@coding.com",
                "test.e.mail+toto.jane@cod.ing.com",
                "testemail+tom@cod.ing.com"};
//        String[] emails = {
//                "test.email+james@coding.com"};
        System.out.println(a.solve_1(emails));
        System.out.println(a.solve_substring(emails));
        System.out.println(a.solve_split(emails));
    }
        //1. basic
    public int solve_1(String[] emails) {
        //1 ds
//        "test.email+james@coding.com",
        Set<String>  set = new HashSet<>(); // 중복x

        //2 for while charAt()으로 조작
        //쪼갠다음에 새로운 스트링으로 담아준다.
        for(String email : emails){
            String localName = makeLocalName(email);
            String dName = makeDName(email);

            set.add(localName+"@"+dName); // 조작된 애들을 만든다음에 set에 add
        }
        return set.size(); // 그 개수를 return
    }

    private String makeDName(String email) {

        return email.substring(email.indexOf("@"));
    }

    private String makeLocalName(String email) {
        StringBuilder sb = new StringBuilder(); // 새롭게 만들어지니까 StringBulider 에 담아준다

        for(int i = 0; i<email.length(); i++){

            if(email.charAt(i) == '.'){
                continue; // 담을 필요가 없으니 continue
            }
            if(email.charAt(i) == '+' || email.charAt(i)=='@'){
                break; // +, @ 일때 필요가 없으니까 for문 자체를 나오는거예요
            }
            sb.append(email.charAt(i));
        }
        return sb.toString();
    }

    //2. solve_substring // 참고삼아서만 보기
    public int solve_substring(String[] emails) {
        int result = 0;
        Set<String> set = new HashSet<>();

        for(int i = 0; i < emails.length; i++){
            String localName = "";
            String domainName = "";
            localName = emails[i].substring(0, emails[i].indexOf("+")).replace(".","");
            domainName = emails[i].substring(emails[i].indexOf("@"));
            set.add(localName + domainName);
        }
        result = set.size();
        return result;

    }

        //3. solve_split
    // 기본적으로 split은 분리하다라는 뜻
    // @을 중심으로 분리하면 되기때문에 상당히 응용문제에서 나온다
    // 파이썬에서도 똑같은 기능이있다.
    public int solve_split(String[] emails) {
        // "test.email+james@coding.com" 받고
        //1 ds
        Set<String> set = new HashSet<>(); // 중복 x
        //2 for, while
        for(String email : emails){
            // "test.email+james@coding.com" 이게 들어온거고
            // 이걸로 나눈거고 스플릿은 기본적으로 String 배열로 만들어준거고
            // 아래처럼 하면은 parts[0] = test.email+james가 있고
            // parts[1] = coding.com이 있는거예요
            String[] parts = email.split("@");
            // 그냥 + 하면 에러가 나와서 Dangling meta character '+' near index 0 컴파일 에러가 나옴
            // 해결 .split("\\+");, .split("[+]");
            //위에껄 하면은 parts[0] 에서 test.email 이랑 james랑 또 나눠지겠죠
            String[] localName = parts[0].split("\\+");
            set.add(localName[0].replace(".","")+"@"+parts[1]); // . 을 ""로 바꾼다
        }
        return set.size();
    }






}
