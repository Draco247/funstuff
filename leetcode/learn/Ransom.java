import java.util.HashMap;
import java.util.LinkedList;

class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<magazine.length(); i++){
            char m = magazine.charAt(i);
            int count = map.getOrDefault(m,0);
            map.put(m,count+1);
        }
        for(int i=0;i<ransomNote.length(); i++){
            char ransom_char = ransomNote.charAt(i);
            int count = map.getOrDefault(ransom_char,0);

            if (count == 0){
                return false;
            }
            map.put(ransom_char,count - 1);
        }
        return true;
    }
}

public class Ransom {
    public static void main(String[] args)
    {
        Solution383 solution = new Solution383();
        System.out.println(solution.canConstruct("aa","ab"));

    }
}