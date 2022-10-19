import java.util.Arrays;
class Solution12 { 
    public int solution(int[] A)
    {
        int N = A.length;
        int sum1 = A[0];
        int sum2 = 0;
        int P = 1;
        for (int i = P; i < N; i++) {
              sum2 += A[i];
            }
        int diff = Math.abs(sum1 - sum2);
        
        for (; P < N-1; P++) {
            sum1 += A[P];
            sum2 -= A[P];
            int newDiff = Math.abs(sum1 - sum2);
            if (newDiff < diff) {
                diff = newDiff;
            }
        }
        return diff;
        // int lowest = Integer.MAX_VALUE;
        // for (int i = 1; i < A.length; i++)
        // {
        //     int[] half1 = new int[i];
        //     int[] half2 = new int[A.length - i];
        //     int half1sum, half2sum = 0;
        //     int newlowest = 0;
        //     half1 = Arrays.copyOfRange(A, 0, i);
        //     half2 = Arrays.copyOfRange(A,i,A.length);
        //     half1sum = Arrays.stream(half1).sum();
        //     half2sum = Arrays.stream(half2).sum();
        //     newlowest = Math.abs(half1sum-half2sum);
        //     if (lowest > newlowest)
        //     {
        //         lowest = newlowest;
        //     }
            
        // }
        // return lowest;
        
    }
   
}
public class tapeequilibrium {
    public static void main(String[] args)
    {
        Solution12 solution = new Solution12();
        int[] A = {3,1,2,4,3};
        System.out.println(solution.solution(A));
    }
    
}