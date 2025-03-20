package lifecoding;

import java.util.Arrays;

// 1940
// 주몽의 명령 (투포인터)
// 6
// 9
// 2 7 4 1 5 3
public class T05_1940 {

    public static void main(String[] args) {
        int n = 6;
        int m = 9;
        int[] nums = {2, 7, 4, 1, 5, 3};
        Arrays.sort(nums);

        int s = 0;
        int e = n-1;
        int count = 0;
        while (s < e) {
            if (nums[s] + nums[e] == m) {
                count++;
                s++;
                e--;
            } else if (nums[s] + nums[e] > m) {
                e--;
            } else if (nums[s] + nums[e] < m) {
                s++;
            }
        }

        System.out.println(count);


    }

}
