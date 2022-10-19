class Solution141 {
    public boolean hasCycle(ListNode head) {
        // need two pointers where one will progress one node at a time while the other will progress two nodes at a time
        ListNode fast_pointer = head;
        ListNode slow_pointer = head;

        while (fast_pointer != null && fast_pointer.next != null ) {

            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;

            // if the values of the two pointers are the same then there is a cycle
            if (fast_pointer == slow_pointer) {
                return true;
            }
        }
        return false;
    }
}

public class linkedlistcycle {
    public static void main(String[] args)
    {
        Solution141 solution = new Solution141();
        int[] yy =  {3,2,0,-4};
//        ListNode head = new ListNode(5,2);
//        System.out.println(solution.hasCycle(head));

    }
}
