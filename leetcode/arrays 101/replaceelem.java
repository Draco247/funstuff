import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

class Solution1299 {
    public int[] replaceElements(int[] arr) {
        // set initial max value to be the last item in the array and work backwards from there
        int max=arr[arr.length-1];

        // sets last item in array to always be -1
        arr[arr.length-1]=-1;

        // loop to swap current item with the current max value if the max is higher
        for(int i = arr.length-2; i>=0 ;i--)
        {
            int current=arr[i];
            arr[i]=max;
            if(current>max){
                max = current;
            }
        }
        return arr;
    }
}

public class replaceelem {
    public static void main(String[] args)
    {
        Solution1299 solution = new Solution1299();
        int[] A = {17,18,5,4,6,1};
        solution.replaceElements(A);

    }
}