import java.util.HashMap;
import java.util.LinkedList;

class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count+=1;
                if (count > max){
                    max = count;
                }
            }

            else if (nums[i] == 0){
                count = 0;
            }
        }
        return max;
    }
}

public class maxconsecones {
    public static void main(String[] args)
    {
        Solution485 solution = new Solution485();
        int[] A = {1,1,0,1,1,1};
        System.out.println(solution.findMaxConsecutiveOnes(A));

    }
}