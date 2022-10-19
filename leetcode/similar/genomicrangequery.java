import java.util.*;

class Solution30 {    
    public int[] solution(String S, int[] P, int[] Q)
    {
        // HashMap<String, Integer> map = new HashMap<String, Integer>();
        int[] A = new int[P.length];
        // map.put("A",1);
        // map.put("C",2);
        // map.put("G",3);
        // map.put("T",4);
        int mm = 0;
        for(int i=0;i<S.length();i++)
        {
            if (S.charAt(i) == 'A')
            {

            }
        }
        
        return Q;
        
    }
}

public class genomicrangequery {
    public static void main(String[] args)
    {
        Solution30 solution = new Solution30();
        String S = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        System.out.println(solution.solution(S,P,Q));
    }
    
    
}
