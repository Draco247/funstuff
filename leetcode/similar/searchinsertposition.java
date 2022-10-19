class Solution3 {
    public int searchInsert(int[] nums, int target) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            //first check if target is in array
            if (target == nums[i])
            {
                pos = i;
                break;
            }

            else
            {
                // if target is lower then any numbers in array that it takes that position
                if (target < nums[i])
                {
                    pos = i;
                    break;
                }

                // otherwise the target is greater then all of the others and takes the last position
                if (target > nums[i])
                {
                    pos = i + 1;
                }
            }
        }
        return pos;
        
    }
}

public class searchinsertposition {
    public static void main(String[] args)
    {
        Solution3 solution = new Solution3();
        int [] nums = {1,3,5,6};
        int target = 7;
        System.out.println(solution.searchInsert(nums,target));
    }
    
}
