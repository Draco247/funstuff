import java.util.Arrays;
import java.util.HashMap;

class Solution136 {
    public int singleNumber(int[] nums) {
        //create hashmap to store each number and it number of occurences
        HashMap<Integer, Integer> map = new HashMap();
        int single = 0;
        for (int i =0; i<nums.length; i++)
        {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        //then need to find key with lowest number and return that value
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                single = entry.getKey();
            }
        }
        return single;
    }
}
public class singlenumber {
    public static void main(String[] args)
    {
        Solution136 solution = new Solution136();
        int[] nums = {1};
        System.out.println(solution.singleNumber(nums));
    }
}
