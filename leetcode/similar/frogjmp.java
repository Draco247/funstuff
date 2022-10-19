class Solution10 { 
    
        public int solution(int X, int Y, int D)
        {
            if ((Y - X) % D == 0) {
                return (Y - X) / D;
            }
            return (Y - X) / D + 1;

        }
    
    
 }

public class frogjmp {
    public static void main(String[] args)
    {
        Solution10 solution = new Solution10();
        System.out.println(solution.solution(10,85,30));
    }
    
}
