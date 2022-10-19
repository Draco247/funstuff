import java.util.Arrays;

class Solution1051 {
    public int heightChecker(int[] heights) {

        int[] sorted = heights.clone();
        Arrays.sort(sorted);

        int count = 0;
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
            System.out.println(heights[i]);
           if (sorted[i] != heights[i]) {
               count++;
           }
        }

        return count;
    }
}

public class heightcheck {
    public static void main(String[] args)
    {
        Solution1051 solution = new Solution1051();
        int[] nums = {1,1,4,2,1,3};
        System.out.println(solution.heightChecker(nums));

    }
}