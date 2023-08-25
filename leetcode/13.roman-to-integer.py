#
# @lc app=leetcode id=13 lang=python
#
# [13] Roman to Integer
#

# @lc code=start
class Solution(object):
    def romanToInt(self, s):
        numerals = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}#dict to hold roman numerals and values
        num = 0
        # replace all reverse numerals with what they would be if they were like other numbers
        s = s.replace("IV", "IIII").replace("IX", "VIIII").replace("XL", "XXXX").replace("XC", "LXXXX")
        s = s.replace("CD", "CCCC").replace("CM", "DCCCC")
        #loop to add
        for i in s:
            if i in numerals:
                num += numerals[i]
                print(num)
        return num
        
# @lc code=end
test = Solution()
print(test.romanToInt("MCMXCIV"))

