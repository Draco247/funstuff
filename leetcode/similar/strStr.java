import java.util.Iterator;

class Solution {
    public int strStr(String haystack, String needle) {
        //need to check if needle is not empty
        if (needle.equals("")) {
            return 0;
        }

        for (int i = 0; i < (haystack.length() - needle.length()) + 1; i ++ ){
            for (int j = 0; j < needle.length(); j ++ ) {
                //if haystack and needle character != then break out of nested loop and increment i by 1
                if (haystack.charAt(i+j) != needle.charAt(j)){
                    // System.out.println(haystack.charAt(i+j));
                    break;
                }
                //if
                if (j == needle.length() -1) {
                    System.out.println(j);
                    return i;
                }
            }
        }
        return -1;
    
       
    }
}

public class strStr {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(solution.strStr(haystack, needle));
    }
}