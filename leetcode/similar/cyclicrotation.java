import java.util.Arrays;
import java.util.HashMap;

class Solution8 { 
    public int[] solution(int[] A, int K) {
        int [] rotatedA = new int[A.length];
       
        for(int i=0; i<A.length; i++) {
          //rotated index needs to "wrap" around end of array
          int rotatedIndex = (i + K) % A.length;
    
          rotatedA[rotatedIndex] = A[i];
        }
        return rotatedA;
      }
}

public class cyclicrotation {
    public static void main(String[] args)
    {
        Solution8 solution = new Solution8();
        int[] A = {3, 8, 9, 7, 6};
        int k = 3;
        System.out.println(Arrays.toString(solution.solution(A, k)));
    }
    
}
