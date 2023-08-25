#
# @lc app=leetcode id=509 lang=python
#
# [509] Fibonacci Number
#

# @lc code=start
class Solution(object):
    def fib(self, n):
        starting = [0,1]
        if n in starting:
            return n
        return self.fib(n-1) + self.fib(n-2)
        
# @lc code=end

test = Solution()
for i in range(0, 10):
    print(test.fib(i))

