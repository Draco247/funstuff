#
# @lc app=leetcode id=125 lang=python
#
# [125] Valid Palindrome
#

# @lc code=start
class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        
        s = "".join([char for char in s if char.isalnum() or char == " "]).replace(" ", "").lower()
        left_pointer = 0
        right_pointer = len(s) - 1
        while left_pointer < right_pointer:
            if s[left_pointer] != s[right_pointer]:
                return False
            left_pointer += 1
            right_pointer -= 1
        return True
    
# @lc code=end
test = Solution().isPalindrome("A man, a plan, a canal: Panama")
print(test)

