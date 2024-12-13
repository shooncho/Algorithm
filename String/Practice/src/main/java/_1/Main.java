package _1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] emails = {"test.email+james@coding.com",
                "test.e.mail+toto.jane@coding.com",
                "testemail+tom@cod.ing.com"};

        System.out.println(solve(emails));
        System.out.println(solve_2(emails));
    }
    //split
    private static int solve_2(String[] emails) {
        Set<String> set = new HashSet<>();

        for(String email : emails){
            String[] parts = email.split("@");
            String[] localD = parts[0].split("\\+");
            set.add(localD[0].replace(".","")+"@"+parts[1]);
        }
        return set.size();
    }
    //basic
    private static int solve(String[] emails) {
        Set<String> set = new HashSet<>();

        for(String email : emails){
            String local = makeLocal(email);
            String d = makeD(email);
            set.add(local+"@"+d);
        }
        return set.size();
    }

    private static String makeD(String email) {
        return email.substring(email.indexOf('@')+1);
    }

    private static String makeLocal(String email) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<email.length(); i++){
            if(email.charAt(i)=='.'){
                continue;
            }

            if(email.charAt(i)=='+' || email.charAt(i)=='@'){
                break;
            }
            sb.append(email.charAt(i));
        }
        return sb.toString();
    }


}
