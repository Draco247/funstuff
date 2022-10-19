import java.util.Arrays;

class Solution905 {
    public int[] sortArrayByParity(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));

        return nums;
    }
}

public class evenparity {
    public static void main(String[] args)
    {
        Solution905 solution = new Solution905();
        int[] nums = {3,1,2,4};
        solution.sortArrayByParity(nums);

    }
}