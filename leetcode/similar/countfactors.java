import java.util.*;

class Solution25 { 
    public int solution(int N) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        factors.add(N);
        System.out.println(Math.sqrt(N));

        if (N == 0 || N == 1) 
        {
            return 1;
        }

        for (int i = 1; i < N; i++)
        {
            if(N%i == 0)
            {
                factors.add(i);
            }
        }
        return factors.size();
       
    }
}

public class countfactors {
    public static void main(String[] args)
    {
        Solution25 solution = new Solution25();
        System.out.println(solution.solution(24));
    }
    
    
}
