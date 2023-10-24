package baekjoon.a01_if;

import java.util.Scanner;

// 1330번 두 수 비교하기
// 두 정수 A와 B가 주어졌을 때, A와 B를 비교
// A가 B보다 큰 경우에는 '>'를 출력한다.
// A가 B보다 작은 경우에는 '<'를 출력한다.
// A와 B가 같은 경우에는 '=='를 출력한다.
// 1    2    <
// 10   2    >
// 5    5    ==
public class A01_1330_compareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("<");
        } else if (a > b) {
            System.out.println(">");
        } else {
            System.out.println("==");
        }

        sc.close();
    }
}
