import java.util.*;

class Solution28 {    
    public int solution(int[] A)
    {
        if(A.length == 0)
        {
            return 1;
        }
        // hashset to store all unique numbers in array
        HashSet<Integer> numbers = new HashSet<Integer>();
        //add items from array to hashset
        for(int i = 0; i < A.length; i++)
        {
            numbers.add(A[i]);
        }

        //check to see if hashset contains i and if it doesn't then return that value
        for(int i = 1; i < A.length; i++)
        {
            if(!numbers.contains(i))
            {
                return i;
            }
        }
        //if the number isnt returned from the loop then its greater then any number in the array so return the next number
        return A.length + 1;
       
    }
    
}

public class missingintV2 {
    public static void main(String[] args)
    {
        Solution28 solution = new Solution28();
        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution.solution(A));
    }
    
    
}
