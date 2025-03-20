package lifecoding;

// 1546
// 새로운 평균 구하기 (배열)
public class T02_1546 {

    public static void main(String[] args) {
        int n = 3;
        int[] score = {10, 20, 30};
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += score[i];
            if (max < score[i]) {
                max = score[i];
            }
        }
        System.out.println("result = " + (sum * 100.0 / max / n));
    }

}
