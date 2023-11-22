package baekjoon.t03_string;

import java.util.Scanner;
// 9086번
public class T03_9086_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String str = sc.next();
            String a = String.valueOf(str.charAt(0));
            String b = String.valueOf(str.charAt(str.length()-1));
            System.out.println(a + b);
        }
    }
}
