package baekjoon.t03_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 11654번 아스키 코드
public class T04_11654_ASCII {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String num = r.readLine();

        System.out.println((int)num.charAt(0));
    }
}
