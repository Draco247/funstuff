import java.util.*;

class Solution35 {    
    public int solution(int N, int K) {

        //first I need to convert the three digit number into a char array
        char[] n_to_chars = Integer.toString(N).toCharArray();
        int result = 0;

        //then i need to use a loop to do the calculations
        for (int i = 0; i < n_to_chars.length; i++) {
            int subtract = Math.min('9' - n_to_chars[i], K);
            n_to_chars[i] += subtract;
            K = K - subtract;
        }

        //need to convert new string into an integer to be returned
        result = Integer.parseInt(new String(n_to_chars));
        return result;
    }
}

public class commonprimedivisors {
    public static void main(String[] args)
    {
        Solution35 solution = new Solution35();
        int N = 512;
        int K = 10;
        System.out.println(solution.solution(N,K));
    }
    
    
}
