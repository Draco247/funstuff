#
# @lc app=leetcode id=14 lang=python
#
# [14] Longest Common Prefix
#

# @lc code=start
class Solution(object):
    def longestCommonPrefix(self, strs):
        l = list(zip(*strs))# first create a list of tuples where each tuple contains the letter at the same index
        prefix = ""

        for i in l:# loop though list and create a set using tuple, if every letter is the same
            if len(set(i))==1:# the length of the set will be 1 otherwise it will be 2, if its 2 then thats the max prefix
                prefix += i[0]
            else:
                break
        return prefix
        
# @lc code=end
test = Solution()
print(test.longestCommonPrefix(["flower","flow","flight"]))

