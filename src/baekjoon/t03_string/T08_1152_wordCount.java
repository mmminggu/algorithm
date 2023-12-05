package baekjoon.t03_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 1152번 단어의 개수
// The Curious Case of Benjamin Button          6
// The first character is a blank               6
// The last character is a blank                6
public class T08_1152_wordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(r.readLine());
        System.out.println(str.countTokens());
    }
}
