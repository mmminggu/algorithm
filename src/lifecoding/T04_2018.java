package lifecoding;

import java.util.Scanner;

// 2018
// 연속된 자연수의 합 구하기 (투포인터)
public class T04_2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        int count = 1;
        int startIdx = 1;
        int endIdx = 1;
        while (endIdx != n) {
            if(sum < n) {
                endIdx++;
                sum += endIdx;
            } else if (sum > n) {
                sum -= startIdx;
                startIdx++;
            } else if (sum == n) {
                count++;
                endIdx++;
                sum += endIdx;
            }
        }
        System.out.println(count);
    }
}
