package lifecoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// 11659
// 구간합 구하기 (배열)
public class T03_11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int suNo = Integer.parseInt(token.nextToken());
        int quizNo = Integer.parseInt(token.nextToken());
        long[] s = new long[suNo + 1];
        token = new StringTokenizer(br.readLine());
        for (int i = 1; i <= suNo; i++) {
            s[i] = s[i - 1] + Integer.parseInt(token.nextToken());
        }
        for (int q = 0; q < quizNo; q++) {
            token = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(token.nextToken());
            int j = Integer.parseInt(token.nextToken());
            System.out.println(s[j] - s[i-1]);
        }
    }

    public static void tt(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split(" ");
        int n = Integer.parseInt(split[0]);     // 수의 개수
        int m = Integer.parseInt(split[1]);     // 합을 구해야 하는 횟수
        String sNum = sc.nextLine();
        String[] sNumSp = sNum.split(" ");
        int[] newArr = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            if(i == 0) {
                newArr[i] = 0;
                continue;
            }
            newArr[i] = newArr[i-1] + Integer.parseInt(sNumSp[i-1]);
            System.out.print(newArr[i] + " ");
        }

        for (int i = 0; i < m; i++) {
            String sRange = sc.nextLine();
            String[] s = sRange.split(" ");
            int start = Integer.parseInt(s[0])-1;
            int end = Integer.parseInt(s[1]);

            int result = newArr[end] - (start > 0 ? newArr[start] : 0);
            System.out.println(result);
        }
    }

}
