import java.util.*;

class Solution29 {    
    public int solution(int A, int B, int K)
    {
        //this one is fully correct but its recursive nature gives it bad performance with larger numbers
        // int count = 0;
        // for (int i = A; i < B+1; i++)
        // {
        //     if(i % K == 0)
        //     {
        //         count++;
        //     }
            
        // }
        // return count;
        return (B/K) - (A/K) + (A%K == 0 ? 1 : 0);
        
    }
}

public class countdiv {
    public static void main(String[] args)
    {
        Solution29 solution = new Solution29();
        int A = 0;
        int B = 2000000000;
        int K = 1;
        System.out.println(solution.solution(A,B,K));
    }
    
    
}
