class Solution142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast_pointer = head;
        ListNode slow_pointer = head;

        while (fast_pointer != null && fast_pointer.next != null) {

            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;
            if (fast_pointer == slow_pointer){
                break;
            }
        }

        if (fast_pointer == null || fast_pointer.next == null) {
            return null;
        }

        while (head != slow_pointer) {
            head = head.next;
            slow_pointer = slow_pointer.next;
        }
        return head;
    }
}


public class linkedlistcycle2 {
    public static void main(String[] args)
    {
        Solution141 solution = new Solution141();
        int[] yy =  {3,2,0,-4};
//        ListNode head = new ListNode(5,2);
//        System.out.println(solution.hasCycle(head));

    }
}
