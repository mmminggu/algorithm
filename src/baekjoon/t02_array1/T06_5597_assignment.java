package baekjoon.t02_array1;

import java.util.Scanner;
// 5597번 과제 안 내신 분
// 입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.
// 출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력
// 3 1 4 5 7 9 6 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
// 2 8
public class T06_5597_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[31];

        for(int i=0; i<28; i++) {
            int o = sc.nextInt();
            n[o] = 1;
        }

        for(int i=1; i<n.length; i++) {
            if(n[i] != 1) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
