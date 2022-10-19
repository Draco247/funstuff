import java.util.ArrayList;

class Solution13 { 
    public int solution(int X, int[] A)
    {
        //basically wants me to find where every number from 1 to X has occured t least once?
        //use summation to find when every number from 1 to X has appeared at least once
        int sum = 0;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < A.length; i++) {

            if (A[i] <= X && !arrayList.contains(A[i])) {
                sum += A[i];
                arrayList.add(A[i]);
            }
            if (A[i] == X) {
                if (sum == X * (X + 1) / 2) {
                    return i;
                }
            }
        }
        return -1;

    }
}

public class frogriverone {
    public static void main(String[] args)
    {
        Solution13 solution = new Solution13();
        int X = 5;
        int[] A = {1,3,1,4,2,3,5,4};
        System.out.println(solution.solution(X,A));
    }
    
}
