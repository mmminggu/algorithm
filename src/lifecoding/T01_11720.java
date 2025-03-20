package lifecoding;

// 11720
// 숫자의 합 구하기 (배열)
public class T01_11720 {

    public static void main(String[] args) {
        int n = 5;
        String sNum = "12345";

        char[] charArray = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            sum += charArray[i] - 48;
        }
        System.out.println("result = " + sum);
    }

}
