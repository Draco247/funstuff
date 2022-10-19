import java.util.Arrays;

class Solution1480 {
    public int[] runningSum(int[] nums) {
        int [] sum_array = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            sum_array[i] = sum;
        }
        return sum_array;
    }
}

public class runningsum {
    public static void main(String[] args)
    {
        Solution1480 solution = new Solution1480();
        solution.runningSum(new int[]{3,1,2,10,1});
//        TreeNode left = new TreeNode(null);
//        TreeNode root = new TreeNode(1,TreeNode lef);

    }
}