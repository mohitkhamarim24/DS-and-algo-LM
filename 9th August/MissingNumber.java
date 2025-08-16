class Solution {
    public int missingNumber(int[] nums) {

        int xor1 = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
           xor1 = xor1 ^ nums[i];
        }
        int xor = 0;
         for(int i = 1 ; i <= nums.length ; i++){
           xor = xor ^ i;
        }
          int ans = xor ^ xor1;
          return ans;
    }
}