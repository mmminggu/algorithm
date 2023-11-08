package baekjoon.t01_for;

import java.io.*;
// 2439번 별찍기2
public class T10_2439_star2 {
    public static void main(String[] args) throws IOException {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(r.readLine());

            String star = "";
            for(int i=0; i<n; i++) {
                String str = "";
                for(int j=n-i; j>1; j--) {
                    str = str + " ";
                }
                star += "*";
                str = str + star;
                w.write(str + "\n");
            }

            w.flush();
            w.close();
    }
}
