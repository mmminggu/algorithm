package baekjoon.t03_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 2675번 문자열 반복
// 2                AAABBBCCC
// 3 ABC            HHHHHTTTTTPPPPP
// 5 /HTP
public class T07_2675_loopStr {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());

        for(int i=0; i<n; i++) {
            String[] str = r.readLine().split(" ");
            String result = "";

            int cnt = Integer.parseInt(str[0]);
            String value = str[1];

            for(int j=0; j<value.length(); j++) {
                for(int k=0; k<cnt; k++) {
                    result += value.charAt(j);
                }
            }
            System.out.println(result);
        }
    }
}
