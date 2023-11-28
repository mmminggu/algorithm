package baekjoon.t03_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 10809번 알파벳 찾기
// a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력
// baekjoon
// 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1

public class T06_10809_findAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String word = r.readLine();

        for(int i=97; i<123; i++) {
            char c = (char)i;
            System.out.print(word.indexOf(c) + " ");
        }
    }
}
