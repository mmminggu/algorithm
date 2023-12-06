package baekjoon.t03_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 2908번 상수
// 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
// 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
// 734 893      437
// 221 231      132
// 839 237      938
public class T09_2908_sangsu {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] str = r.readLine().split(" ");

        int max = 0;
        for(int i=0; i<2; i++) {
            String num = "";
            for(int j=2; j>=0; j--) {
                num += str[i].charAt(j);
            }
            if(max < Integer.parseInt(num)) {
                max = Integer.parseInt(num);
            }
        }
        System.out.println(max);
    }
}
