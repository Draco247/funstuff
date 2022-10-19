import java.util.*;

class Solution34 {    
    public int solution(int[] D, int X) {
        for(int i=0; i<D.length; i++)
        {
           System.out.println(D[i]);
           for(int j=0; j<D.length; j++)
           {
            System.out.println(D[j]);
           }
        }
        return X;
        // write your code in Java SE 8
    }
}

public class chocsbynumbers {
    public static void main(String[] args)
    {
        Solution34 solution = new Solution34();
        int[] D = {5,8,2,7};
        int X = 3;
        System.out.println(solution.solution(D,X));
    }
    
    
}
