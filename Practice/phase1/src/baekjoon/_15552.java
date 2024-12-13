package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class _15552 {
    public static void main(String[] args) throws IOException {
        //15552 빠른 A+B
        //BufferedReader : Scanner 유사
        //Bufferedwriter : System.out.println() 유사

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        bw.close();
    }
}
