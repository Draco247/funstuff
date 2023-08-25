class twosumsolution {
    // this works but nested for loop gives bad time complexity of O(n^2)
//    public int[] twoSum(int[] nums, int target) {
//        int[] res = new int[2];
//        for (int i = 0; i < nums.length; i++){
//            for (int j = i+1; j < nums.length; j++){
//                if (j < nums.length){
//                    if (nums[i] + nums[j] == target){
//                        res[0] = i;
//                        res[1] = j;
//                    }
//                }
//
//            }
//        }
//        return res;
//    }
    // better solution using hashmaps
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        // create hashmap from array of nums
        for (int i = 0; i< nums.length; i++){
            numMap.put(nums[i], i);
        }

        // check hashmap for remainder number and if it exists return its index in the array
        for (int i = 0; i< nums.length; i++){
            int neededNum = target - nums[i];
            if(numMap.containsKey(neededNum) && numMap.get(neededNum) != i ){
                res[0] = i;
                res[1] = numMap.get(neededNum);
                return res;
            }
        }



        return res;
    }
}