package baekjoon.t01_for;

import java.io.*;
// 2438번 별찍기1
public class T09_2438_star1 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        String str = "";

        for(int i=0; i<n; i++) {
            str = str + "*";
            w.write(str + "\n");
        }

        w.flush();
        w.close();
    }
}
