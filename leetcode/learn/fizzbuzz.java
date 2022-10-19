import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution412 {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            if (i%3 == 0 && i%5 == 0){
                result.add("FizzBuzz");
            }

            else if (i%3 == 0){
                result.add("Fizz");
            }

            else if (i%5 == 0){
                result.add("Buzz");
            }

            else{
                result.add(""+i);
            }
        }
        return result;
    }
}

public class fizzbuzz {
    public static void main(String[] args)
    {
        Solution412 solution = new Solution412();
        solution.fizzBuzz(15);
//        System.out.println(solution.fizzBuzz(3));
//        TreeNode left = new TreeNode(null);
//        TreeNode root = new TreeNode(1,TreeNode lef);

    }
}