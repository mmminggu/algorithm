package baekjoon.t05_multiple_factor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 약수 구하기
// N의 약수들 중 K번째로 작은 수를 출력한다. 만일 N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않을 경우에는 0을 출력
// 6의 약수는 1, 2, 3, 6, 총 네 개
// 6 3      3
// 25 4     0

public class T02_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());

        int result = 0;
        int cnt = 0;

        for(int i=1; i<=a; i++) {
            if(a % i == 0) {
                cnt++;
            }

            if(cnt == b) {
                result = i;
                break;
            }
        }
        System.out.println(result);
        br.close();
    }
}
