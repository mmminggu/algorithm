package baekjoon.t04_deepen01;

import java.util.Scanner;
// 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
// 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
// kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
// 3
// happy                3
// new
// year
// 4
// aba                  1
// abab
// abcabc
// a
// 5                    4
// ab
// aa
// aca
// ba
// bb
public class T07_1316_groupWordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = n;
        for(int i=0; i<n; i++) {
            String str = sc.next();

            for(int j=1; j<str.length(); j++) {
                String nStr = str.substring(0, j);
                if(nStr.indexOf(str.charAt(j)) > -1 && (str.charAt(j-1) != str.charAt(j))) {
                    cnt--;
                    break;
                }
            }
        }
        System.out.println(cnt);

        sc.close();
    }
}
