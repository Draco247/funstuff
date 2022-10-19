class Solution1342 {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if(num % 2 == 0) {
                num = num / 2;
                count += 1;
            }

            else {
                num-=1;
                count += 1;
            }
        }
        return count;
    }
}

public class numOfSteps {
    public static void main(String[] args)
    {
        Solution1342 solution = new Solution1342();
        System.out.println(solution.numberOfSteps(123));
//        System.out.println(solution.fizzBuzz(3));
//        TreeNode left = new TreeNode(null);
//        TreeNode root = new TreeNode(1,TreeNode lef);

    }
}