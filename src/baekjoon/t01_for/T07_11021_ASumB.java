package baekjoon.t01_for;

import java.io.*;
import java.util.StringTokenizer;

// 11021번 A+B-7
public class T07_11021_ASumB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer str;
        for (int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            bw.write("Case #" + i + ": " + (Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken())) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
