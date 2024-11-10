package devnossi;

// 정수가 저장된 배열 nums이 주어졌을 때, nums의 원소중 두 숫자를 더해서 target이 될 수 있으면 True
// 불가능하면 False 반환. 같은 원소 두 번 사용 못함
//     2 <= nums.length <= 10^4
// -10^9 <= nums[i] <= 10^9
// -10^9 <= target <= 10^9
// input: nums = {4, 1, 9, 7, 5, 3, 16}, target: 14 output: True
// input: nums = {2, 1, 5, 7}, target: 4, output: False

import java.util.Arrays;

public class T01_roof {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 7};
        int target = 4;

        System.out.println(완전탐색(nums, target));
        System.out.println(투포인터(nums, target));

    }

    static String 투포인터(int[] nums, int target) {
        // 정렬
        Arrays.sort(nums);

        int first = 0;
        int last = nums.length-1;
        while (first < last) {
            int sum = nums[first] + nums[last];
            if(sum == target) {
                return "True";
            } else if (sum > target) {
                last--;
            } else {
                first++;
            }

        }

        return "False";
    }

    static String 완전탐색(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for (int j = i+1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if(sum == target) {
                    return "True";
                }
            }
        }
        return "False";
    }
}
