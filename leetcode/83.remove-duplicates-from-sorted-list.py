#
# @lc app=leetcode id=83 lang=python
#
# [83] Remove Duplicates from Sorted List
#

# @lc code=start
# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def deleteDuplicates(self, head):
        cur = head # initialise current item as the head of the linkedlist
        while cur:
            while cur.next and cur.next.val == cur.val:# first check if there is a next val in the linkedlist
                                                            # and if there is then check if the current item is equal to the next one
                  cur.next = cur.next.next# if val is duplicated then current node is skipped 
            cur = cur.next# otherwise move onto the next node
        return head                                         

        
# @lc code=end
# duplist = ListNode(1)
head = ListNode(1)
head.next = ListNode(1)
head.next = ListNode(2)
test = Solution().deleteDuplicates(head)
print(test.val)

