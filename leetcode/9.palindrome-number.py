#
# @lc app=leetcode id=9 lang=python
#
# [9] Palindrome Number
#

# @lc code=start
class Solution(object):
    def isPalindrome(self, x):
        print(x)
        for i in range(len(str(x))):
            print(str(x)[i])
            print(str(x)[-i-1])
            if str(x)[i]!= str(x)[-i-1]:
                return False
        return True
        
# @lc code=end
test = Solution()
print(test.isPalindrome(1001))

