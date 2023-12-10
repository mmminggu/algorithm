package baekjoon.t03_string;

import java.util.Scanner;
// 11718번 그대로 출력하기
// 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
// 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
// Hello                Hello
// Baekjoon             Baekjoon
// Online Judge         Online Judge
public class T11_11718_print {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(str);
        }

        sc.close();
    }
}
