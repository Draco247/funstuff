import java.util.HashMap;

class Solution941 {
    public boolean validMountainArray(int[] arr) {
        int arrlength = arr.length;
        int i = 0;

        // while loop to see if values are only increasing, when it breaks i should show the peak of the array
        while (i+1 < arrlength && arr[i] < arr[i+1])
            i++;

        // peak of the array can't be the first or last item in the array
        if (i == 0 || i == arrlength-1)
            return false;

        // while loop to make sure loop is only decreasing
        while (i+1 < arrlength && arr[i] > arr[i+1])
            i++;

        // if i == the number of items in the array then it is a mountain array
        if (i == arrlength-1){
            return true;
        }

        //otherwise it isn't
        else{
            return false;
        }
    }
}

public class mountain {
    public static void main(String[] args)
    {
        Solution941 solution = new Solution941();
        int[] nums = {0,3,2,1};
        int val = 3;
        System.out.println(solution.validMountainArray(nums));

    }
}