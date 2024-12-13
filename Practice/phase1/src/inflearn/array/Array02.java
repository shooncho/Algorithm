package inflearn.array;

public class Array02 {
    public static void main(String[] args) {
        //ReverseStringSolution
        /*
        *
           문제 . 문자열 뒤집기
           주어진 문자열을 거꾸로 뒤집은 문자열을 만드는 함수를 작성하라.
             예) hello => olleh
             예) happy new year => reay wen yppah
        * */
        Array02 array02 = new Array02();
        System.out.println(array02.solution3("Hello".toCharArray()));
    }

    // H e l l o => o l l e H
    private char[] solution1(char[] message){
        // 시간, 공간 : O(N)
        //똑같은 크기에 넣기
        char[] reverseMessage = new char[message.length];

        //거꾸로 순회
        //4 - 4 -> 0
        //4 - 3 -> 1
        //4 - 2 -> 2
        //4 - 1 -> 3
        //4 - 0 -> 4
        // 규칙이 보이죠 둘이 더하면 4가되잖아요??
        // 그럼 message.length -1 -i 하면 되는거죠??
        for (int i = message.length-1; i >= 0; i--){
            //이러면 4가 들어가는 부분이 0이 들어가죠?
            reverseMessage[message.length -1 -i] = message[i];
        }
        return reverseMessage;
    }

    //h e l l o
    //순회를 그러면 절반만하면되는거예요
    //홀수일때는 하나하나 못 믿치게 짝수일때는 다 순회하면 되는거죠?
    // 4 - 0 = 4
    // 4 - 1 = 3
    // 시간 O(n) 공간 O(1)
    private char[] solution2(char[] message){
        for(int i = 0; i < message.length/2; i++){
            char temp = message[i]; // 담아 놓고
            message[i] = message[message.length-1 -i];
            message[message.length-1 -i] = temp;
        }
        return message;
    }
    // 다음 방법은
    // 자바가 제공하는 StringBuilder에 자제체 대해서 학습하면 좋을거 같습니다.

    private String solution3(char[] message) {
        StringBuilder sb = new StringBuilder();
        for(int i = message.length -1; i >= 0; i--){
            sb.append(message[i]);
        }
        return sb.toString();
    }
}
