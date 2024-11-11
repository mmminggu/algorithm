package devnossi;

// 인터넷브라우저
// 1 <= homepage.length <= 20
// 1 <= url.length <= 20
// 1 <= steps <= 100
// ["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
// [["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
// output
// [null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]
public class T02_linkedList_BrowserHistory {

    Node curr;

    public static void main(String[] args) {
        T02_linkedList_BrowserHistory obj = new T02_linkedList_BrowserHistory("leetcode.com");
        obj.visit("google.com");
        obj.visit("facebook.com");
        obj.visit("youtube.com");
        System.out.println(obj.back(1));
        System.out.println(obj.back(1));
        System.out.println(obj.forward(1));
        obj.visit("linkedin.com");
        System.out.println(obj.forward(2));
        System.out.println(obj.back(2));
        System.out.println(obj.back(7));
    }

    public T02_linkedList_BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }

    public void visit(String url) {
        // 현재 페이지에 방문. 모든 향후 기록을 지웁니다.
        Node node = new Node(url);
        curr.next = node;
        node.prev = curr;
        curr = node;
        curr.next = null;
    }

    public String back(int steps) {
        // 기록에서 뒤로 이동
        while (curr.prev != null && steps-- > 0) {
            curr = curr.prev;
        }
        return curr.url;
    }

    public String forward(int steps) {
        // 기록에서 앞으로 이동
        while (curr.next != null && steps-- > 0) {
            curr = curr.next;
        }
        return curr.url;
    }

    public class Node {
        String url;
        Node prev, next;

        public Node(String url) {
            this.url = url;
            prev = null;
            next = null;
        }
    }
}
