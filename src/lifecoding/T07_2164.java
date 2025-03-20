package lifecoding;

import java.util.LinkedList;
import java.util.Queue;

// 2164
// 카드2 (큐)
// 6
// 4 출력
public class T07_2164 {
    public static void main(String[] args) {
       int n = 6;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while(q.size() > 1){
            q.poll();
            q.add(q.poll());
        }

        System.out.println(q.peek());
    }
}
