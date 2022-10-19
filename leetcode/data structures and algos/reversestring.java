import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

class Solution344 {
    public void reverseString(char[] s) {

        // set initial values of pointer to 0 and whatever the index of the last item in the array would be
        int i = 0;
        int j = s.length-1;

        // loop that keeps swapping position of characters until it is fullt reversed
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
            }

        System.out.println(s);
    }
}

public class reversestring {
    public static void main(String[] args)
    {
        Solution344 solution = new Solution344();
        char[] A = {'h','e','l','l','o'};
        solution.reverseString(A);

    }
}