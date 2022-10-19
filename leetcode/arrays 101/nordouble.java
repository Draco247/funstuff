import java.util.HashMap;

class Solution1346 {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if ((map.containsKey(2*arr[i])) || (map.containsKey(arr[i] / 2)) && (arr[i] % 2 == 0)) {
                return true;
            }
            else{
                map.put(arr[i], arr[i]);
            }
        }
        return false;
    }
}

public class nordouble {
    public static void main(String[] args)
    {
        Solution1346 solution = new Solution1346();
        int[] nums = {0,0};
        int val = 3;
        System.out.println(solution.checkIfExist(nums));

    }
}