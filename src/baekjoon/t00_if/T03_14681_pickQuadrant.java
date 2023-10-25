package baekjoon.t00_if;

import java.util.Scanner;

// 14681번 사분면 구하
// 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나) 출력
// 1사분면 : + +
// 2사분면 : - +
// 3사분면 : - -
// 4사분면 : + -
// 12   5        1
// 9    -13     4
public class A03_14681_pickQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > 0) {
            if(b > 0) {
                System.out.println("1");
            }else {
                System.out.println("4");
            }
        }else {
            if(b > 0) {
                System.out.println("2");
            }else {
                System.out.println("3");
            }
        }

        sc.close();
    }
}
