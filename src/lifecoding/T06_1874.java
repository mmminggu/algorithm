package lifecoding;

import java.util.Stack;

// 1874
// 스택 수열
// 8
// 4, 3, 6, 8, 7, 5, 2, 1
// + + + + - - + + - + + - - - - -
// 5
// 1, 2, 5, 3, 4
// NO
public class T06_1874 {
    public static void main(String[] args) {
        int n = 8;
        int[] nums = {4, 3, 6, 8, 7, 5, 2, 1};
        Stack<Integer> num = new Stack<>();
        String result = "";
        boolean no = false;
        int j = 1;
        for (int i = 0; i < n; i++) {
            if(j <= nums[i]){
                while (j <= nums[i]) {
                    num.push(j++);
                    result += "+ ";
                }
                num.pop();
                result += "- ";
            } else if (j > nums[i]) {
                int a = num.pop();
                result += "- ";
                if (a > nums[i]) {
                    System.out.println("NO");
                    no = true;
                    break;
                }
            }
        }

        if (!no) {
            System.out.println(result);
        }
    }
}
