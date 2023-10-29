package baekjoon.t00_if;

import java.sql.SQLOutput;
import java.util.Scanner;

// 2884번 알람 시계
// 알람을 45분 앞서는 시간으로 설정
// 첫째 줄에 두 정수 H와 M이 주어진다.
// (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 알람 시간 H시 M분
// 10   10      9   25
// 0    30      23  45
// 23   40      22  55
public class T04_2884_alarmClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if(minute < 45){
            hour = hour <= 0 ? 23 : hour - 1;
            minute = minute - 45 + 60;
        }else{
            minute = minute - 45;
        }
        System.out.println(hour + " " + minute);

        sc.close();
    }
}
