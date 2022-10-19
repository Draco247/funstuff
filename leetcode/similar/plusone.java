import java.util.Arrays;

class Solution5 {
    public int[] plusOne(int[] digits) {

        String numtext = "";
    
        //need to convert contents of int array to String
        for(int i =0; i< digits.length; i++)
        {
            numtext += String.valueOf(digits[i]);
        }

        //need to convert string to a number and add 1
        int num = Integer.parseInt(numtext);
        num += 1; 

        int[] newarray = new int[String.valueOf(num).length()];
        //need to convert number back to array
        for(int i = 0; i< newarray.length; i++)
        {
            newarray[i] = Character.getNumericValue(String.valueOf(num).charAt(i));
        }
        return digits;
        
    }
}

public class plusone {
    public static void main(String[] args)
    {
        Solution5 solution = new Solution5();
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(solution.plusOne(digits)));
    }
    
}
