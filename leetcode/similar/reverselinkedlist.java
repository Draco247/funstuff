class Solution50 {
    public ListNode reverseList(ListNode head) {
        //initially previous node = null as there isnt a previous node yet
        ListNode prev = null;
        //looping until they are not any more nodes next to head
        while (head!= null)
        {
            //getting next node
            ListNode next_node = head.next;
            //once we have gotten the next node, we swap the prev node value with the head
            //and the current head for the next node to move forward in the reverse list
            head.next = prev;
            prev = head;
            head = next_node;
        }
        return prev;
    }
}

public class reverselinkedlist {
    public static void main(String[] args)
    {
        Solution50 solution = new Solution50();
        ListNode head = new ListNode(1);
        System.out.println(solution.reverseList(head));
    }

}


