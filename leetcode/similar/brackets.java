
class Solution18 { 
    public int solution(String S)
    {
        if(S.length()%2 != 0)
        {
            return 0;
        }

        String half1 = S.substring(0, (S.length()/2));
        String half2 = S.substring((S.length()/2));
        for(int i=0; i<half1.length(); i++)
        {
            char match1 = half1.charAt(i);
            char match2 = half2.charAt(half2.length()-1-i);
            System.out.println(match1 + " " + match2);
            if((match1 == '(' && match2 != ')') || (match1 == ')' && match2 == '('))
            {
                return 0;
            }

            if((match1 == '[' && match2 != ']') || (match1 == ']' && match2 == '['))
            {
                return 0;
            }

            if((match1 == '{' && match2 != '}') || (match1 == '}' && match2 == '{'))
            {
                return 0;
            }

        }
        return 1;  
    }
}

public class brackets {
    public static void main(String[] args)
    {
        Solution18 solution = new Solution18();
        System.out.println(solution.solution("{[()()]}"));
    }
    
}
