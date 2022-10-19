import java.util.*;

class Solution32 {    
    public int solution(int[] A)
    {
        //first need to find peaks
        ArrayList<Integer> peaks = new ArrayList<Integer>();
        for(int i = 1; i < A.length-1; i++)
        {
            if((A[i] > A[i-1]) && (A[i]> A[i+1]))
            {
                // System.out.println(i);
                peaks.add(i);
            }
        }
        int N = A.length;
        
        // from the "biggest possible number" to smaller number
        for(int numBlocks =N; numBlocks >=1; numBlocks--){
                    
            if( N % numBlocks ==0){ // it is divisible   
            
                int blockSize = N / numBlocks; 
                int ithOkBlock =0;  // the ith block has peak(s)

                // test all the peaks 
                // if a peak is found in the ith block
                // then, go to the (i+1)th block
                for(int peaksIndex : peaks){
                    if( peaksIndex/blockSize == ithOkBlock){ // peak in the ith block
                        ithOkBlock++; // go to check (i+1)th block
                    }
                }   
                
                // ithOkBlock: the number of blocks having peak(s) 
                // if all the blocks have peak(s)
                // then, return the number of blocks
                // note: we test from the biggest possible number
                // so, once we find it, we can just return it
                // (no need to check the smaller possible numbers)
                if(ithOkBlock == numBlocks){
                    return numBlocks;
                }
            }
        }   
        return 0;

        
    }
}

public class peaks {
    public static void main(String[] args)
    {
        Solution32 solution = new Solution32();
        int[] A = {1,2,3,4,3,4,1,2,3,4,6,2};
        System.out.println(solution.solution(A));
    }
    
    
}
