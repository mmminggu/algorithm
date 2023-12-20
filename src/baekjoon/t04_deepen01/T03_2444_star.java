package baekjoon.t04_deepen01;

import java.util.Scanner;
// 5
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
public class T03_2444_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        for(int i=1; i<=(n*2-1); i++) {
            String str = "";

            temp = n-i;
            if(i >= n) {
                temp = i-n;
            }
            for(int j=0; j<temp; j++) {
                str += " ";
            }
            int aa = (n*2-1)-(str.length()*2);
            for(int j=0; j<aa; j++) {
                str += "*";
            }
            temp--;
            System.out.println(str);
        }

        sc.close();
    }
}
