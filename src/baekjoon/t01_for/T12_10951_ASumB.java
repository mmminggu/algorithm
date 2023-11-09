package baekjoon.t01_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 10951번 A+B
public class T12_10951_ASumB {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;
        while((str = r.readLine()) != null){
            st = new StringTokenizer(str + "");
            int sum = (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            System.out.println(sum);
        }
    }
}
