import java.util.LinkedList;

class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast_pointer = head, slow_pointer = head;

        //since fast pointer is going twice as fast as slow pointer, when it has reached the end of the linked list the slow
        //pointer will be at the middle
        while (fast_pointer != null && fast_pointer.next != null) {
            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;
        }
        return slow_pointer;
    }
}

public class middlenode {
    public static void main(String[] args)
    {
        Solution876 solution = new Solution876();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        ListNode head = new ListNode(nodes);
//        System.out.println(solution.middleNode(head));
//        System.out.println(solution.fizzBuzz(3));
//        TreeNode left = new TreeNode(null);
//        TreeNode root = new TreeNode(1,TreeNode lef);

    }
}