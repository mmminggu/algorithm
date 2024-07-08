package baekjoon.t05_multiple_factor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 약수들의 합
// 6                6 = 1 + 2 + 3
// 12               12 is NOT perfect.
// 28               28 = 1 + 2 + 4 + 7 + 14
// -1
// 테스트케이스 마다 한줄에 하나씩 출력해야 한다.
// n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).
// 이때, 약수들은 오름차순으로 나열해야 한다.
// n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.
public class T03_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int n = Integer.parseInt(br.readLine());

            if(n == -1) break;

            String result = n + " = ";
            int sum = 0;
            for(int i=1; i<n; i++) {
                if(n % i == 0) {
                    sum += i;
                    result += i + " + ";
                }
            }
            result = result.substring(0, result.length()-2);
            if(sum != n) {
                result = n + " is NOT perfect.";
            }
            System.out.println(result);
        }

        br.close();
    }
}
