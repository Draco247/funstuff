#
# @lc app=leetcode id=21 lang=python
#
# [21] Merge Two Sorted Lists
#

# @lc code=start
# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        if not list1 or not list2: # if either list is empty return the not empty list
            return list1 or list2
        if list1.val < list2.val:# if list1.val is smaller than list2.val then 
            list1.next = self.mergeTwoLists(list1.next, list2)
            return list1
        else:
            list2.next = self.mergeTwoLists(list1, list2.next)
            return list2
    
        
# @lc code=end
list1 = ListNode([1,2,4])
list2 = ListNode([1,3,4])
test = Solution().mergeTwoLists(list1, list2)
print()

