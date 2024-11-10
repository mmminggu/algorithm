package baekjoon.t05_multiple_factor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
// 입력
// 72
// 출력
// 2
// 2
// 2
// 3
// 3
public class T06_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 2;
        while(n != 1) {
            if(n % i == 0) {
                n = n/i;
                System.out.println(i);
            }else {
                i++;
            }
        }
        br.close();
    }
}
