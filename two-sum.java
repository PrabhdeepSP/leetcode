import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = {0,0};
        HashMap<Integer, Integer> arr = new HashMap<Integer, Integer>();
        for(int i=0; i< nums.length;i++){
            int complement = target - nums[i];
            if(arr.containsKey(complement)) return new int[]{arr.get(complement), i};
            arr.put(complement, i);
        }
    }
}