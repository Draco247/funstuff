import java.util.*;
import java.util.Map.Entry;
class Solution21 { 
    public int solution(int[] A)
    {
        //initialise half length value
        int halflength = A.length/2;
        //create hashmap to store numbers and number of occurences
        HashMap<Integer, Integer> Amap = new HashMap<Integer, Integer>();
        //loop to save numbers and number of occurences
        for(int i = 0; i < A.length; i++)
        {
            if(Amap.containsKey(A[i]))
            {
                Amap.put(A[i], Amap.get(A[i]) + 1);
            }

            else
            {
                Amap.put(A[i], 1);
            }
        }
        
        int dominator = 0;
        for (Entry<Integer, Integer> entry : Amap.entrySet()) {  // Iterate through HashMap
            if (entry.getValue() > halflength) {
               dominator = entry.getKey();  // set dominator to key with highest number of occurences
            }
        }

        for(int i = 0; i < A.length; i++)
        {
            if(A[i] == dominator) 
            {
                return i;
            }
        }
        return -1;
        
    }
}

public class dominator {
    public static void main(String[] args)
    {
        Solution21 solution = new Solution21();
        int[] A = {3,4,3,2,3,-1,3,3};
        System.out.println(solution.solution(A));
    }
    
}