package baekjoon.t06_rectangle_triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 직사각형의 넓이
// 2                6
// 3
public class T01_27323 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(a * b);
        br.close();
    }
}
