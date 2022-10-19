import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++)
            sum+=nums[i];
        double res=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            res=Math.max(res,sum);
        }
        return res/k;
//        double sum = 0;
//        double avg = 0;
//        double highest = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            sum = 0;
//            if(i+k > nums.length){
//                break;
//            }
//            else{
//                for (int j = i; j < i+k; j++){
//                    sum += nums[j];
////                    System.out.println(nums[j]);
////                    System.out.println(sum);
//                }
//
//                avg = sum / k;
//
//                if (avg > highest){
//                    highest = avg;
//                }
//            }
//
////            System.out.println(highest);
////            System.out.println("egegegeg");
//        }
//        return highest;
    }
}

public class maximumavgsubarray {
    public static void main(String[] args)
    {
        Solution643 solution = new Solution643();
        int[] A = {-5};
        int k = 1;
        System.out.println(solution.findMaxAverage(A, k));

    }
}