import java.util.Arrays;
import java.util.HashMap;


class Solution9 { 
    public int solution(int[] A)
    {
        
        HashMap<Integer, Integer> occurences = new HashMap<Integer, Integer>();
        for(int i = 0; i < A.length; i++)
        {
            Integer count = occurences.get(A[i]);
            // System.out.println(A[i]);
            if(count == null)
            {
                occurences.put(A[i], 1);
            }

            else
            {
                occurences.put(A[i], count + 1);
            }
        }

        int minkey = 0;
        int minvalue = 1;
        for(int key : occurences.keySet())
        {
            if(occurences.get(key) == minvalue)
            {
                minkey = key;
            }   
        }
        System.out.println(minkey);
        return minkey;
        
    }
 }
public class oddocurrencesinarray {
    public static void main(String[] args)
    {
        Solution9 solution = new Solution9();
        int[] A = {9,3,9,3,9,7,9};
        int k = 3;
        System.out.println(solution.solution(A));
    }
    
}
