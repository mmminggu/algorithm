package baekjoon.t04_deepen01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력
// Mississipi       ?
// zZa              Z
// z                Z
// baaa             A
public class T05_1157_wordStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String word = r.readLine().toUpperCase();

        int[] arr = new int[26];	// 알파벳 a~z 25개			// 아스키코드 대문자 : 65~90   소문자 : 97~122

        for(int i=0; i<word.length(); i++) {
            arr[(int)word.charAt(i)-65]++;
        }

        int max = -1;
        char result = '?';
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                result = (char) (i+65);
            }else if (arr[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
