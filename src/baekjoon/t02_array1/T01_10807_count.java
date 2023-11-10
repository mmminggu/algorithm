package baekjoon.t02_array1;

import java.util.Scanner;
// 10807번 개수 세기
// 11                               3
// 1 4 1 2 4 2 4 2 3 4 4
// 2

// 11                               0
// 1 4 1 2 4 2 4 2 3 4 4
// 5
public class T01_10807_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[sc.nextInt()];
        for(int i=0; i<nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        int cnt = 0;
        for(int num : nums) {
            if(num == v) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
