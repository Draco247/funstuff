import java.util.Stack;

class Solution19 { 
    public int solution(int[] A, int[] B)
    {
        Stack<Integer> st = new Stack<>(); 
        int numAlive = A.length;
        
        for(int i=0; i<A.length; i++){
            
            // case 1; for the fish going to downstrem
            // push the fish to "stack", so we can keep them from the "last" one
            if(B[i] ==1){
                st.push(A[i]); // push the size of the downstream fish
            }
            // case 2: for the fish going upstream
            // check if there is any fish going to downstream
            if(B[i] ==0){
                while( !st.isEmpty() ){ 
                    // if the downstream fish is bigger (eat the upstream fish)
                    if( st.peek() > A[i] ){
                        numAlive--;
                        break;      // the upstream fish is eaten (ending)   
                    }
                    // if the downstream fish is smaller (eat the downstream fish)
                    else if(st.peek() < A[i]){
                        numAlive--;
                        st.pop();   // the downstream fish is eaten (not ending)
                    }
                }
            }  
        }    
        
        return numAlive;
    }
}

public class fish {
    public static void main(String[] args)
    {
        Solution19 solution = new Solution19();
        int[]A = {4,3,2,1,5};
        int[]B = {0,1,0,0,0};
        System.out.println(solution.solution(A,B));
    }
    
}