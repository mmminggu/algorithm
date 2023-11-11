package baekjoon.t02_array1;

import java.io.*;
import java.util.StringTokenizer;

// 10871번 X보다 작은 수
// 10 5                         1 4 2 3
// 1 10 4 9 2 3 8 5 7 6
public class T02_10871_smallNum {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer str = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(str.nextToken());
        int min = Integer.parseInt(str.nextToken());

        str = new StringTokenizer(r.readLine());
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(str.nextToken());
            if(min > num) w.write(num + " ");
        }

        w.flush();
        w.close();
    }
}
