import java.util.*;

class Solution31 {    
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

        //need to find out how many flags we need
        int position = peaks.get(0);
        int count = 1;
        int numflags = peaks.size();
        System.out.println(peaks);
        
        for(int i = 0; i < numflags-1; i++)
        {
            System.out.println(Math.abs((peaks.get(i+1) - position)));
            if(Math.abs((peaks.get(i+1) - position)) >= numflags)
            {
                position = peaks.get(i+1);
                count++;
            }
        }
        return count;
    }
}

public class flags {
    public static void main(String[] args)
    {
        Solution31 solution = new Solution31();
        int[] A = {7, 10, 4, 5, 7, 4, 6, 1, 4, 3, 3, 7};
        System.out.println(solution.solution(A));
    }
    
    
}

