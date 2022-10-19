import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int[] newarray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newarray[i] = nums[i]*nums[i];
        }
        Arrays.sort(newarray);
        //can make it faster but can't be bothered rn
        return newarray;
    }
}

public class squaresarray {
    public static void main(String[] args)
    {
        Solution977 solution = new Solution977();
        int[] A = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(solution.sortedSquares(A)));

    }
}