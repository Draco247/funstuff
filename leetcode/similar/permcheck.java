import java.util.ArrayList;
import java.util.Arrays;

class Solution14 { 
    public int solution(int[] A)
    {
        //need to make sure every number from 1 to n appears once in array
        Arrays.sort(A);
        for(int i = 1; i < A.length+1; i++)
        {
            if(A[i-1]!= i)
            {
                return 0;
            }
        }
        return 1;
       
    }
}

public class permcheck {
    public static void main(String[] args)
    {
        Solution14 solution = new Solution14();
        int[] A = {4,1,3,2};
        System.out.println(solution.solution(A));
    }
    
}
