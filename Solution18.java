class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode root = new ListNode(0);
        ListNode curr = root;

        int next = 0;
        while (l1 != null || l2 != null) {
            int val;

            if (l1 == null) {
                val = l2.val + next;
                l2 = l2.next;
            } else if (l2 == null){
                val = l1.val + next;
                l1 = l1.next;
            } else {
                val = l1.val + l2.val + next;
                l1 = l1.next;
                l2 = l2.next;
            }

            if (val >= 10){
                curr.val = val%10;
                next = 1;
            } else{
                curr.val = val;
                next = 0;
            }

            if (l1 != null || l2 != null){
                curr.next = new ListNode();
                curr = curr.next;
            }
        }

        if (next != 0) {
            curr.next = new ListNode(1);
        }
    
        return root;
    }





}