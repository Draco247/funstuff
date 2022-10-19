import java.util.*;

class Solution23 { 
    public int solution(int[] A) {
        //if array has only one item or is empty return 0
        if(A.length == 1 || A.length == 0){
            return 0;
        }
        
        //stores the max profit found so far
        int maxSoFar = 0;
        int maxEndingHere = 0;
        int minPrice = A[0];
        
        for(int i = 1; i < A.length; i++){
            maxEndingHere = Math.max(0, A[i] - minPrice);
            System.out.println(maxEndingHere);
            minPrice = Math.min(minPrice, A[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        
        return maxSoFar;
    }
}

public class maxprofit {
    public static void main(String[] args)
    {
        Solution23 solution = new Solution23();
        int[] A = {23171,21011,21123,21366,21013,21367};
        System.out.println(solution.solution(A));
    }
    
}