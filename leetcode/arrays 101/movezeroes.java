import java.util.Arrays;

class Solution283 {
    public void moveZeroes(int[] nums) {
        int NonZero = 0;

        // if the current item is not 0 then we add it just before the last non-zero we found
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[NonZero++] = nums[i];
            }
        }

        //then we add the zeroes at the end
        for (int i = NonZero; i < nums.length; i++) {
            nums[i] = 0;
        }

       System.out.println(Arrays.toString(nums));
    }
}

public class movezeroes {
    public static void main(String[] args)
    {
        Solution283 solution = new Solution283();
        int[] nums = {0,1,0,3,12};
        solution.moveZeroes(nums);

    }
}