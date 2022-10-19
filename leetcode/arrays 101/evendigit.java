import java.util.HashMap;
import java.util.LinkedList;

class Solution1295 {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int length = String.valueOf(nums[i]).length();
            if (length % 2 == 0) {
                count+=1;
            }
        }
        return count;
    }
}

public class evendigit {
    public static void main(String[] args)
    {
        Solution1295 solution = new Solution1295();
        int[] A = {555,901,482,1771};
        System.out.println(solution.findNumbers(A));

    }
}