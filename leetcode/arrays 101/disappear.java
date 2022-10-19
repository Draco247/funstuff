import java.util.*;

class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(i+1)) {
                result.add(i+1);
            }
        }

//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + "/" + entry.getValue());
//        }
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
        return result;
    }
}

public class disappear {
    public static void main(String[] args)
    {
        Solution448 solution = new Solution448();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(solution.findDisappearedNumbers(nums));

    }
}