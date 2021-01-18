public class listNode {
    int val;
    listNode next;

    listNode() {
    }

    listNode(int val) {
        this.val = val;
    }

    listNode(int val, listNode next) {
        this.val = val;
        this.next = next;
    }
}

/*
 * Single Linked List Method runtimes many methods are limited by the linear
 * traversal time 1. Access: O(n) 2. Search: O(n) 3. Push: front O(1); back O(n)
 * if no tail pointer 4. Pop: front O(1); back O(n) 5. Insert: O(n) worst case
 * 6. Erase: O(n) worst case
 */