package baekjoon.t01_for;

import java.io.*;
import java.util.StringTokenizer;
// 11022번 A+B-8
public class T08_11022_ASumB {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer str;

        int n = Integer.parseInt(r.readLine());
        for(int i=1; i<=n; i++){
            str = new StringTokenizer(r.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            int sum = a + b;
            w.write("Case #" + i + ": " + a + " + " + b + " = " + sum + "\n");
        }
        w.flush();
        w.close();
    }
}
