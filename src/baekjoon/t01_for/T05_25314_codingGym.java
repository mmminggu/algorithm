package baekjoon.t01_for;
// 25314번 코딩은 체육과목입니다.
// 4    long int
// 20   long long long long long int

import java.util.Scanner;

public class T05_25314_codingGym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        for(int i=0; i<n/4; i++){
            result += "long ";
        }
        System.out.println(result + "int");
        sc.close();
    }
}
