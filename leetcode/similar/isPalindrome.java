class Solution125 {
    public boolean isPalindrome(String s) {
//        //first need to remove all punctuation and spaces from the string
//        String reversed;
//        StringBuilder sb = new StringBuilder();
//        s = s.replaceAll("[^A-Za-z0-9]+", "").toUpperCase();
//
//        //next need to reverse the string
//        sb.append(s);
//        reversed = String.valueOf(sb.reverse());
//        //then need to compare them to see if they are the same
//        if (reversed.equals(s))
//        {
//            return true;
//        }
        //this works but is too slow

        //first need to remove all punctuation and spaces from the string
        String reversed = "";
        char ch;
        s = s.replaceAll("[^A-Za-z0-9]+", "").toUpperCase();

        //next need to reverse the string
        for (int i = 0; i < s.length(); i++)
        {
            ch = s.charAt(i);
            reversed = ch + reversed;
        }
        System.out.println(reversed);
        //then need to compare them to see if they are the same
        if (reversed.equals(s))
        {
            return true;
        }

        return false;
    }
}

public class isPalindrome {
    public static void main(String[] args)
    {
        Solution125 solution = new Solution125();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

}
