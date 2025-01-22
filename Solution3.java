import java.util.HashSet;

public class Solution3 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        // if (head == null) return false;
        // HashSet<ListNode> set = new HashSet<>();

        // ListNode prev = head;
        // boolean flag = set.add(head);

        // while(prev.next != null){
        //     ListNode current = prev.next;
        //     flag = set.add(current);
        //     if (!flag) {
        //         return true;
        //     }
        // }
        // return false;

        int i = 0;
        ListNode l = head;
        while (l != null) {
            l = head.next;
            if (i++ == 10000) return true;

        }

        return false;

    }

    public static void main(String[] args) {
        
    }
}
