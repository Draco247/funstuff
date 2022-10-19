import java.util.Arrays;

class solution {
    public int lengthOfLastWord(String s) {
//        need to seperate each word in the string
         String[] arr = s.split("\\s+");
         //need to get length of last word in split array
         int lastwordlength = arr[arr.length - 1].length();
        return lastwordlength;

    }
}

public class lengthlastword {
    public static void main(String[] args)
    {
        solution solution = new solution();
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));
    }

}
