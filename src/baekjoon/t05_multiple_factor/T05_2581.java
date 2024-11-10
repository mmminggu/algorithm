package baekjoon.t05_multiple_factor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.
// 단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
// 60           620
// 100          61
public class T05_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = n;

        for(int i=m; i<=n; i++) {
            int cnt = 0;
            if(i == 1) continue;
            for(int j=2; j<i-1; j++) {
                if(i % j == 0) {
                    cnt++;
                    break;
                }
            }
            if(cnt == 0) {
                sum += i;
                if(min > i) {
                    min = i;
                }
            }

        }

        if(sum > 0) {
            System.out.println(sum);
            System.out.println(min);
        }else {
            System.out.println(-1);
        }

        br.close();
    }
}
