import java.util.*;

class Solution26 { 
    public int solution(int N)
    {
        //first need to find factors of N to get A and B
        ArrayList<Integer> factors = new ArrayList<Integer>();

        if (N == 1) 
        {
            return 4;
        }

        for (int i = 1; i < N+1; i++)
        {
            if(N%i == 0)
            {
                factors.add(i);
            }
        }
        //need to use factors to find minperimeter
        int minperimeter = (2 * factors.get(0)) + (2*factors.get(factors.size() - 1));
        int tempperimeter = 0;
        for (int i = 1; i < factors.size()-1; i++)
        {
            tempperimeter = (2 * factors.get(i)) + (2*factors.get(factors.size() - (i+1)));
            if (tempperimeter < minperimeter)
            {
                minperimeter = tempperimeter;
            }
        }
        return minperimeter;
        
    }
    
}

public class minperimeterrectangle {
    public static void main(String[] args)
    {
        Solution26 solution = new Solution26();
        System.out.println(solution.solution(30));
    }
    
    
}
