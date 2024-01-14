package baekjoon.t04_deepen01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T08_25206_yourAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Float> map = new HashMap<String, Float>();
        map.put("A+", 4.5f);
        map.put("A0", 4.0f);
        map.put("B+", 3.5f);
        map.put("B0", 3.0f);
        map.put("C+", 2.5f);
        map.put("C0", 2.0f);
        map.put("D+", 1.5f);
        map.put("D0", 1.0f);
        map.put("F", 0.0f);

        float credit_sum = 0;
        float sum = 0;
        for(int i=0; i<20; i++) {
            String subject = sc.next();
            float credit = sc.nextFloat();
            String cls = sc.next();

            if(cls.equals("P")) {
                continue;
            }

            float num = map.get(cls);
            credit_sum += credit;
            sum += credit * num;

        }

        System.out.println(String.format("%.6f", (sum/credit_sum)));
        sc.close();
    }
}
