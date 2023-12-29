package baekjoon.t04_deepen01;

import java.util.Scanner;
// level                1
// baekjoon             0
public class T04_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String nStr = "";
        for(int i=str.length()-1; i>=0; i--) {
            nStr += str.charAt(i);
        }

        int result = 0;
        if(str.equals(nStr)) {
            result = 1;
        }

        System.out.println(result);

        sc.close();
    }
}
