package baekjoon.t02_array1;

import java.util.Scanner;
// 10810번 공 넣기
// 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다. 공이 들어있지 않은 바구니는 0을 출력
// 5 4                          1 2 1 1 0
// 1 2 3
// 3 4 4
// 1 4 1
// 2 2 2
public class T05_10810_putBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pocket = new int[sc.nextInt()];
        int m = sc.nextInt();

        for(int i=0; i<m; i++) {
            int[] nums = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            int first = nums[0];
            int second = nums[1];
            int third = nums[2];
            for(int j=first; j<=second; j++) {
                pocket[j-1] = third;
            }
        }
        for(int i=0; i<pocket.length; i++) {
            System.out.print(pocket[i] + " ");
        }
        sc.close();
    }
}
