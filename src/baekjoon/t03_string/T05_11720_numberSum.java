package baekjoon.t03_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//  11720번 숫자의 합
// 5            15
// 54321
// 25           7
// 7000000000000000000000000
// 11           46
// 10987654321
public class T05_11720_numberSum {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());

        String str = r.readLine();

        int sum = 0;
        String[] split = str.split("");
        for(String value : split) {
            sum += Integer.parseInt(value);
        }

        System.out.println(sum);
    }
}
