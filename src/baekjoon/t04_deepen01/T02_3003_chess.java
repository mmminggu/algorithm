package baekjoon.t04_deepen01;

import java.io.*;

// 3003번
// 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
// 동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성
// 입력 - 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수
// 출력 - 몇 개의 피스를 더하거나 빼야 되는지
// 0 1 2 2 2 7              1 0 0 0 0 1
// 2 1 2 1 2 1              -1 0 0 1 0 7
public class T02_3003_chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a = {1, 1, 2, 2, 2, 8};
        int[] b = new int[6];

        String s = br.readLine();
        String[] split = s.split(" ");
        for(int i=0; i<split.length; i++) {
            b[i] = Integer.parseInt(split[i]);
        }

        String str = "";
        for(int i=0; i<b.length; i++) {
            str += (a[i] - b[i]) + " ";
        }

        bw.write(str);
        br.close();
        bw.close();
    }
}
