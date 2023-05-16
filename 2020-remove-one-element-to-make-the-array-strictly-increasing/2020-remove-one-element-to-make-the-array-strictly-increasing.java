class Solution {
    
    public boolean canBeIncreasing(int[] nums) {

        int count = 0; 
        for (int i = 1; i < nums.length && count < 2; i++) {
            if (nums[i - 1] >= nums[i]) {
                count++;
                if (i > 1 && nums[i - 2] >= nums[i]) 
                    nums[i] = nums[i - 1];
            }
        }
        return count < 2;   
    }
}    