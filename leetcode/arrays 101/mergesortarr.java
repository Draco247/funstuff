import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m++] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}

public class mergesortarr {
    public static void main(String[] args)
    {
        Solution88 solution = new Solution88();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        solution.merge(nums1, m, nums2, n);

    }
}