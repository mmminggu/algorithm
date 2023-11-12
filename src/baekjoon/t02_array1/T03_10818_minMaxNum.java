package baekjoon.t02_array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// 10818번 최소, 최대
// 5                    7 35
// 20 10 35 30 7
public class T03_10818_minMaxNum {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        StringTokenizer str = new StringTokenizer(r.readLine());
        int[] array = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(array);

        System.out.println(array[0] + " " + array[n-1]);
    }
}
