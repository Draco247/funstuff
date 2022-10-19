import java.util.*;

class Solution24 { 
    public int solution(int[] A) {
        // initial setting A[0]
        int maxEndingPrevious = A[0];
        int maxEndingHere = A[0];
        int maxSoFar = A[0];
 
        // note: for i=0, it will return A[0] (also for "one element" cases)  
           
        for(int i = 1; i < A.length; i++){
            maxEndingHere = Math.max(A[i], maxEndingPrevious + A[i]); // <--- key point~!!
            maxEndingPrevious = maxEndingHere;
            maxSoFar = Math.max(maxSoFar, maxEndingHere); // update the max (be careful)
        }
        
        return maxSoFar; // can be used for "all negative" cases 
    }
}

public class maxslicesum {
    public static void main(String[] args)
    {
        Solution24 solution = new Solution24();
        int[] A = {3,2,-6,4,0};
        System.out.println(solution.solution(A));
    }
    
    
}
