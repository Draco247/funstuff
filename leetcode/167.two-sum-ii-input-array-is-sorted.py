#
# @lc app=leetcode id=167 lang=python
#
# [167] Two Sum II - Input Array Is Sorted
#

# @lc code=start
class Solution(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        first_pointer = 0
        second_pointer = len(numbers)-1
        while first_pointer < second_pointer:
            sum = numbers[first_pointer] + numbers[second_pointer]
            if sum == target:
                return [first_pointer+1, second_pointer+1]
            elif sum < target:
                first_pointer += 1
            else:
                second_pointer -= 1
        
# @lc code=end
test = Solution().twoSum([5,25,75], 100)
print(test)

