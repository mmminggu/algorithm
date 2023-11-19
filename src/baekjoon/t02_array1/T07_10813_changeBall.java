package baekjoon.t02_array1;

import java.util.Scanner;
// 10813번 공 바꾸기
// 5 4                  3 1 4 2 5
// 1 2
// 3 4
// 1 4
// 2 2
public class T07_10813_changeBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pocket = new int[sc.nextInt()];
        int m = sc.nextInt();

        for(int i=0; i<pocket.length; i++) {
            pocket[i] = i+1;
        }

        for(int i=0; i<m; i++) {
            int[] num = {sc.nextInt(), sc.nextInt()};
            int a = num[0];
            int b = num[1];

            int temp = pocket[a-1];
            pocket[a-1] = pocket[b-1];
            pocket[b-1] = temp;
        }

        for(int i : pocket) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
