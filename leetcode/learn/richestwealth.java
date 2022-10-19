import java.util.Arrays;

class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int highest = 0,sum;

        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
                if (sum > highest){
                    highest = sum;
                }
            }
        }
        return highest;
    }
}

public class richestwealth {
    public static void main(String[] args)
    {
        Solution1672 solution = new Solution1672();
        int[][] accounts = new int[][] {{2,8,7},{7,1,3},{1,9,5}};
        solution.maximumWealth(accounts);
//        TreeNode left = new TreeNode(null);
//        TreeNode root = new TreeNode(1,TreeNode lef);

    }
}