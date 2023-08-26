#
# @lc app=leetcode id=49 lang=python
#
# [49] Group Anagrams
#

# @lc code=start
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        worddicts = {}
        anagramGroups = []
        for word in strs:
            sortedstring = ''.join(sorted(word))
            stringlist = worddicts.get(sortedstring)

            if stringlist is None:
                worddicts[sortedstring] = []
           
            worddicts[sortedstring].append(word)

        print(worddicts)
        for word in worddicts:
            anagramGroups.append(worddicts[word])
        return anagramGroups
        
# @lc code=end
test = Solution().groupAnagrams(["eat","tea","tan","ate","nat","bat"])
print(test)


