import java.util.Arrays;

class Solution15 { 
    public int solution(int[] A)
    {
        //check if array is empty
        if(A.length == 0)
        {
            return 0;
        }
        //sort the array
        Arrays.sort(A);
        //stores number of distinct numbers
        int count = 1;
        //find distinct numbers
        for(int i=1; i < A.length; i++)
        {
            if(A[i] != A[i-1])
            {
                count++; 
            }
        }
        
        return count;
        
    }
}

public class Distinct {
    public static void main(String[] args)
    {
        Solution15 solution = new Solution15();
        int[] A = {2,1,1,2,3,1,4,1};
        System.out.println(solution.solution(A));
    }
    
}
