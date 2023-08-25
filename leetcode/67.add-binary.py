#
# @lc app=leetcode id=67 lang=python
#
# [67] Add Binary
#

# @lc code=start
class Solution(object):
    def addBinary(self, a, b):
        a = int(a, 2)
        b = int(b, 2)
        print(a)
        print(b)
        return bin(a+b)[2:]
        
# @lc code=end
test = Solution().addBinary("111", "11")
print(test)

