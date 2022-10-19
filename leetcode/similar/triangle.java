import java.util.Arrays;

class Solution17 { 
    public int solution(int[] A)
    {
       
         // sort the array
         Arrays.sort(A);
         System.out.println(Arrays.toString(A));
         for (int i = 0; i < A.length; i++)
         {
            /**
         * Since the array is sorted A[i + 2] is always greater or equal to previous values
         * So A[i + 2] + A[i] > A[i + 1] ALWAYS
         * As well ass A[i + 2] + A[i + 1] > A[i] ALWAYS
         * Therefore no need to check those. We only need to check if A[i] + A[i + 1] > A[i + 2]?
         * Since in case of A[i] + A[i + 1] > MAXINT the code would strike an overflow (ie the result will be greater than allowed integer limit)
         * We'll modify the formula to an equivalent A[i] > A[i + 2] - A[i + 1]
         * And inspect it there
         */
            if (A[i] >= 0 && A[i] > A[i + 2] - A[i + 1])
            {
     
                 return 1;
            }
         }
         return 0;
    }
}

public class triangle {
    public static void main(String[] args)
    {
        Solution17 solution = new Solution17();
        int[] A = {10,2,5,1,8,20};
        System.out.println(solution.solution(A));
    }
    
}
