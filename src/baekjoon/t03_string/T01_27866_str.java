package baekjoon.t03_string;

import java.util.Scanner;
// 27866번 문자와 문자열
// Sprout       r
// 3
// shiftpsh     p
// 6
// Baekjoon     k
// 4
public class T01_27866_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(str.substring(n-1, n));
        sc.close();
    }
}
