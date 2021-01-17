class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode list = new ListNode(-1);
        ListNode head = list;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                list.next = l1;
                l1 = l1.next;
            } else {
                list.next = l2;
                l2 = l2.next;
            }
            list = list.next;
        }

        if (l1 == null) {
            list.next = l2;
        } else {
            list.next = l1;
        }

        return head.next;
    }
}

// time: O(n), n<m where n=l1.length(), m=l2.length()
// space: O(n+m)