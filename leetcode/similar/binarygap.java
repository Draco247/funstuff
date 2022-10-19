
class Solution7 {
     public int solution(int N)
     {
        //need to convert integer to binary
        String binary = Integer.toBinaryString(N);
        int count = 0;
        int longest = 0;

        //need to find longest binary gap
        for (int i = 0; i < binary.length(); i++)
        {
            if (binary.charAt(i) == '0')
            {
                count +=1;
            }

            else
            {
                if(longest < count)
                {
                    longest = count;
                }
                count = 0;
            }
        }

        return longest;
        
     }
}
public class binarygap {
    public static void main(String[] args)
    {
        Solution7 solution = new Solution7();
        System.out.println(solution.solution(20));
    }
    
}
