class Solution {

    public int minIncrementForUnique(int[] nums) {

        Arrays.sort(nums); 
        int inc = 0; 
        for ( int i = 1; i < nums.length; i++ ) {
            if ( nums[i-1] >= nums[i] ) {
                inc = inc + nums[i-1] - nums[i] + 1; 
                nums[i] = nums[i] + ((nums[i-1] - nums[i]) + 1); 
            } 
        }
        return inc; 
    }
}