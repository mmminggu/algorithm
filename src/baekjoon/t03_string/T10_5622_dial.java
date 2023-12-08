package baekjoon.t03_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T10_5622_dial {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String str = r.readLine();
        int sum = 0;
        // 65~90
        for(int i=0; i<str.length(); i++) {
            int val = str.charAt(i);
            if(val < 68) { sum += 3; }
            else if(val < 71) { sum += 4; }
            else if(val < 74) { sum += 5; }
            else if(val < 77) { sum += 6; }
            else if(val < 80) { sum += 7; }
            else if(val < 84) { sum += 8; }
            else if(val < 87) { sum += 9; }
            else { sum += 10;}
        }
        System.out.println(sum);
    }
}
