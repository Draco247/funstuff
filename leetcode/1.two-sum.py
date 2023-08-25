#
# @lc app=leetcode id=1 lang=python
#
# [1] Two Sum
#

# @lc code=start
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        # brute force solution - O(n^2)
        for i in range(0,len(nums)):
            print(nums[i])
            print("--------")
            for j in range(i+1, len(nums)):
                print(nums[j])
                if nums[i] + nums[j] == target:
                    return [i,j]
        
        # optimised using dict
        listtodict = {}
        for i in range(0, len(nums)):
            if target - nums[i] in listtodict:
                return [listtodict[target - nums[i]], i]
            listtodict[nums[i]] = i
        return []
        print(listtodict)
        
# @lc code=end
test = Solution().twoSum([3,3], 6)
print(test)

