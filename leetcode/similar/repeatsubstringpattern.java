class Solution2 {
    public boolean repeatedSubstringPattern(String s) {
        String temp = "";

        for (int i=0; i<s.length(); i++) 
        {
            temp += s.charAt(i);
            // System.out.println(temp);
            //need to check if next character = character at the beginning of the string
            for (int j=0; j<s.length()-1; j++)
            {
                // System.out.println(s.charAt(j+1));
                if(temp.charAt(0) == s.charAt(j))
                {
                    System.out.println(s.charAt(j));
                   
                }
                
            }
            
        }
        return false;
        
    }
}


public class repeatsubstringpattern {
    public static void main(String[] args)
    {
        Solution2 solution = new Solution2();
        String s = "abab";
        System.out.println(solution.repeatedSubstringPattern(s));
    }
    
}
