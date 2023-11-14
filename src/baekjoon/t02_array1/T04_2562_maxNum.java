package baekjoon.t02_array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 2562번 최댓값
// 3                        85
// 29                       8
// 38
// 12
// 57
// 74
// 40
// 85
// 61
public class T04_2562_maxNum {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[9];

        for(int i=0; i<9; i++) {
            array[i] = Integer.parseInt(r.readLine());
        }

        int max = 0;
        int order = 0;
        int count = 1;
        for(int value : array) {
            if(value > max) {
                max = value;
                order = count;
            }
            count++;
        }
        System.out.println(max);
        System.out.println(order);
    }
}
