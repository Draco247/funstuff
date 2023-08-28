#
# @lc app=leetcode id=206 lang=python
#
# [206] Reverse Linked List
#

# @lc code=start
# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        prev = None
        curr = head
        while curr:
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        return prev

        
# @lc code=end
def list_to_linked_list(lst):
    if not lst:
        return None
    
    head = ListNode(lst[0])
    current = head
    
    for value in lst[1:]:
        current.next = ListNode(value)
        current = current.next
    
    return head

def linked_list_to_list(head):
    lst = []
    current = head
    
    while current:
        lst.append(current.val)
        current = current.next
    
    return lst

linked_list = list_to_linked_list([1,2,3,4,5])
test = Solution().reverseList(linked_list)
print(linked_list_to_list(test))

