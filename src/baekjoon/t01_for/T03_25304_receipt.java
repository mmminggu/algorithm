package baekjoon.t01_for;

import java.util.Scanner;

// 25304번 영수증
// 260000       합계      Yes        250000            No
// 4            개수                 4
// 20000 5                          20000 5
// 30000 2                          30000 2
// 10000 6                          10000 6
// 5000 8                           5000 8
public class T03_25304_receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int n = sc.nextInt();
        int result = 0;

        for(int i=0; i<n; i++){
            int price = sc.nextInt();
            int cnt = sc.nextInt();
            result += price * cnt;
        }
        System.out.println(total == result ? "Yes" : "No");

        sc.close();
    }
}
