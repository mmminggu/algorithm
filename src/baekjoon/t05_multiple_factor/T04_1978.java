package baekjoon.t05_multiple_factor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 주어진 수들 중 소수의 개수를 출력한다.
// 4
// 1 3 5 7
// 출력 : 3
public class T04_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = n;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while(st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            if(a == 1) {
                cnt--;
                continue;
            }
            for(int j=2; j<a; j++) {
                if(a % j == 0) {
                    cnt--;
                    break;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
