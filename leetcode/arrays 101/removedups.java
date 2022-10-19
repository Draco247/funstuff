import java.util.Arrays;

class Solution_26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        nums[i++] = nums[0];
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j-1]){
                nums[i++] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        return i;
    }
}

public class removedups {
    public static void main(String[] args)
    {
        Solution_26 solution = new Solution_26();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        solution.removeDuplicates(nums);

    }
}