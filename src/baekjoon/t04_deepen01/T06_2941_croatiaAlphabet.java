package baekjoon.t04_deepen01;

import java.util.Scanner;

// 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
// č    ć   dž    đ     lj   nj    š    ž
// c=   c-  dz=   d-    lj   nj    s=   z=
// ljes=njak    6
// ddz=z=       3
// c=c=         2
// dz=ak        3
public class T06_2941_croatiaAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] c = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = sc.next();

        for(int i=0; i<c.length; i++) {
            int a = str.indexOf(c[i]);
            if(a > -1) {
                str = str.replace(c[i], "0");
            }
        }
        System.out.println(str.length());
        sc.close();
    }
}
