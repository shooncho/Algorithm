import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
//        1. 보석은 대소문자를 구분해서 갖고 있어야한다.
//        2. aA -> 2개
//        3. 보석과 저장한다 set
//        4. Stone을 for문 루프
//        5. Set에 있는 값과 비교해서 count
//        String jewels = "aA", stones = "aAAbbbb";
        String jewels = "zz", stones = "ZZ";
        System.out.println(solve(jewels,stones));
    }
    public static int solve(String jew, String stones) {
        //1. ds
        //이 보석을 담기로했으니까 보석을 담을 저장소가 필요 그래서
        // 저는 Set 에 Character를 담아야한다 왜냐?? a A를 담아야하니까
        Set<Character> set = new HashSet<>();

        //2 for while
        //jew 하나 씩 뺄려면 toCharArray를 써서 저걸 파싱하듯이 빼야하니까
        //Char[] 에 담는거예요
        char[] charArr = jew.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            set.add(charArr[i]); // a, A 이렇게 저장된다 보석을 담은 상태인거죠
        }
        //이제 스톤에 있는걸 빼면서 비교를하면되는거죠
        //이제 돌을 빼야합니다.
        int count = 0;
        char[] stoneArr = stones.toCharArray();
        for (int i = 0; i < stoneArr.length; i++) {
            if (set.contains(stoneArr[i])) { //빼서 이제 비교를해야하니까 set.contains
                //이제 카운트를 세야하는거죠??
                count++;
            }
        }
        return count;
    }
}
