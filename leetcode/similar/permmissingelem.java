import java.util.Arrays;
class Solution11 { 
    public int solution(int[] A)
    {
        Arrays.sort(A);
        int count = 1;
        for (int i=0;i<A.length;i++)
        {
            if(A[i] != count)
            {
                break;
            }
            count += 1;
            
        }
        return count;

    }
}
public class permmissingelem {
    public static void main(String[] args)
    {
        Solution11 solution = new Solution11();
        int[] A = {1,2,3,4,6};
        System.out.println(solution.solution(A));
    }
    
}
