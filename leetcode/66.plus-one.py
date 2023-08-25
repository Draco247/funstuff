#
# @lc app=leetcode id=66 lang=python
#
# [66] Plus One
#

# @lc code=start
class Solution(object):
    def plusOne(self, digits):
        digitstostring = ''.join(map(str, digits))# convert list to str
        digitstoint = int(digitstostring)
        digitstoint += 1
        return list(map(int, str(digitstoint)))# convert int back to list
        
# @lc code=end
test = Solution().plusOne([9])
print(test)

