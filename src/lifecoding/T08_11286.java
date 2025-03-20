package lifecoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 11286
// 절대값 힙 (우선순위큐)
public class T08_11286 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if (first == second) {
                return o1 > o2 ? 1 : -1;
            }
           return first - second;
        });

        for (int i = 0; i < n; i++) {
            int no = Integer.parseInt(br.readLine());
            if (no == 0) {
                if(q.size() > 0){
                    System.out.println(q.poll());
                } else {
                    System.out.println("0");
                }
            } else {
                q.add(no);
            }
        }
    }
}
