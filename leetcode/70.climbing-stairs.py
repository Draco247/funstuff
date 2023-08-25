#
# @lc app=leetcode id=70 lang=python
#
# [70] Climbing Stairs
#

# @lc code=start
class Solution(object):
    def climbStairs(self, n):
        used = {} # used to store number of combinations for each step
        used[1] = 1# set initial value for first 2 steps since theres only 1 and 2 ways to get each
        used[2] = 2

        def climb(n):# recursively function
            if n in used:# if the number is already in the dictionary then the value is returned immediately
                return used[n]
            else: # if its not in the dictionary then it calculates the number of combinations for the previous and 
                used[n] = climb(n-1) + climb(n-2) # n-2 step and adds them together, because you can only get to n by taking 1 or 2 steps
                print(used)
                return used[n]
                
        return climb(n)
        
# @lc code=end
test = Solution().climbStairs(10)
print(test)

