//Given an array of integers nums and an integer target, return indices of the 
//two numbers such that they add up to target. 
//
// You may assume that each input would have exactly one solution, and you may 
//not use the same element twice. 
//
// You can return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// 
//
// Example 2: 
//
// 
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
// 
//
// Example 3: 
//
// 
//Input: nums = [3,3], target = 6
//Output: [0,1]
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// Only one valid answer exists. 
// 
//
// 
//Follow-up: Can you come up with an algorithm that is less than 
//O(n²) time complexity?
//
// Related Topics Array Hash Table 👍 49166 👎 1601


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        // create hashmap from array of nums
        for (int i = 0; i< nums.length; i++){
            numMap.put(nums[i], i);
        }

        // check hashmap for remainder number and if it exists return its index in the array
        for (int i = 0; i< nums.length; i++){
            int neededNum = target - nums[i];
            if(numMap.containsKey(neededNum) && numMap.get(neededNum) != i ){
                res[0] = i;
                res[1] = numMap.get(neededNum);
                return res;
            }
        }



        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
