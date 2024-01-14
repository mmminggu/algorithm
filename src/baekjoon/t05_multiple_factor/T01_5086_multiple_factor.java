package baekjoon.t05_multiple_factor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력
// 8 16                     factor
// 32 4                     multiple
// 17 5                     neither
// 0 0
public class T01_5086_multiple_factor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            if(a == 0 && b == 0) break;
            if(b % a == 0) {
                System.out.println("factor");
            }else if(a % b == 0) {
                System.out.println("multiple");
            }else {
                System.out.println("neither");
            }
        }

        br.close();
    }
}
