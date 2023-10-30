package baekjoon.t00_if;

import java.util.Scanner;

// 2525번 오븐시계
// 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산
// 14 30        --> 14 50
// 20
// 17 40        --> 19 0
// 80
// 23 48        --> 0 13
// 25
public class T05_2525_ovenClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int time = sc.nextInt();

        String[] strs = str.split(" ");
        int hour = Integer.parseInt(strs[0]);
        int minute = Integer.parseInt(strs[1]);

        hour =  (((hour * 60) + minute + time) / 60) % 24;
        minute = (minute + time) % 60;

        System.out.println(hour + " " + minute);

        sc.close();
    }
}
