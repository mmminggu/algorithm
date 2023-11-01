package baekjoon.t00_if;

import java.util.Scanner;

// 2480번 주사위 세개
// 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
// 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
// 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다
// 3 3 6        1300
// 2 2 2        12000
// 6 2 5        600
public class T06_2480_diceThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = 0;
        if (a == b && b == c) {
            result = 10000 + a * 1000;
        } else if (a == b || a == c){
            result = 1000 + a * 100;
        } else if(b == c){
            result = 1000 + b * 100;
        } else {
            int max = a;
            if(max < b){
                max = b;
            }
            if (max < c) {
                max = c;
            }

            result = max * 100;
        }

        System.out.println(result);
        sc.close();
    }
}
