package baekjoon.t01_for;

import java.io.*;
import java.util.StringTokenizer;

// 15552번 빠른 A+B
// 5        n
// 1 1                  2
// 12 34                46
// 5 500                505
// 40 60                100
// 1000 1000            2000
public class T06_15552_fastASumB {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(read.readLine());

        StringTokenizer str;
        for(int i=1; i<=n; i++) {
            str = new StringTokenizer(read.readLine());
            write.write((Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken())) + "\n");
        }
        write.flush();
        write.close();
    }
}
