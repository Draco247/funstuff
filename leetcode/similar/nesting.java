import java.util.Stack;

class Solution20 { 
    public int solution(String S)
    {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            //if = '(' then add to the stack to show start of new bracket
            if(S.charAt(i) == '(')
            {
                stack.push(S.charAt(i));
            }
            //if = ')' then check if its valid and remove from stack or return 0
            if(S.charAt(i) == ')')
            {
                if(stack.isEmpty() || stack.peek() != '(')
                {
                    return 0;
                }

                else
                {
                    stack.pop();
                }
            }
            
        }
        if(stack.isEmpty()==true)
        {
            return 1;
        }
        return 0;

    }
}

public class nesting {
    public static void main(String[] args)
    {
        Solution20 solution = new Solution20();
        System.out.println(solution.solution("(()())"));
    }
    
}