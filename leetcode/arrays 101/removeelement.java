class Solution_27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

public class removeelement {
    public static void main(String[] args)
    {
        Solution_27 solution = new Solution_27();
        int[] nums = {3,2,2,3};
        int val = 3;
        solution.removeElement(nums, val);

    }
}