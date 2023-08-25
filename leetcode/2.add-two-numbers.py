#
# @lc app=leetcode id=2 lang=python
#
# [2] Add Two Numbers
#

# @lc code=start
# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        carry = 0 # val to store the carry
        root = n = ListNode(0)# set initial value of new linked list to 0
        while l1 or l2 or carry: # continue loop until there are no nodes left in either listed list and carry is empty
            v1 = v2 = 0 # set initial value of the digits for the current iteration for both lists to 0
            if l1: # if l1 is longer then set v1 to the current value and move l1 to the next node
                v1 = l1.val
                l1 = l1.next
            if l2: # if l2 is longer then set v2 to the current value and move l2 to the next node
                v2 = l2.val
                l2 = l2.next
            carry, val = divmod(v1+v2+carry, 10)# calculate the sum of v1 + v2+the carry and then divide by 10
                                                # to get the digit value and the new carry
            n.next = ListNode(val)
            n = n.next 
        
# @lc code=end
l1 = ListNode(2)
l1.next = ListNode(4)
l1.next.next = ListNode(3)
l2 = ListNode(5)
l2.next = ListNode(6)
l2.next.next = ListNode(4)
test = Solution().addTwoNumbers(l1,l2)

