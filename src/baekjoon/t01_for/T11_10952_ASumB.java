package baekjoon.t01_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 10952번 A+B
// 1 1      2
// 2 3      5
// 3 4      7
// 9 8      17
// 5 2      7
// 0 0
public class T11_10952_ASumB {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        while(true) {
            str = new StringTokenizer(r.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            if(a == 0 && b == 0) {
                break;
            }
            System.out.println(a + b);
        }
    }
}
