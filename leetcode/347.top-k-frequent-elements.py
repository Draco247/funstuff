#
# @lc app=leetcode id=347 lang=python
#
# [347] Top K Frequent Elements
#

# @lc code=start
class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        numstodict = {}
        for num in nums:
            if num in numstodict:
                numstodict[num] += 1
            else:
                numstodict[num] = 1

        numstodict = dict(sorted(numstodict.items(), key=lambda x: x[1], reverse=True)) 
        return list(numstodict.keys())[:k]

                

                    
# @lc code=end
test = Solution().topKFrequent([4,1,-1,2,-1,2,3],2)
print(test)

