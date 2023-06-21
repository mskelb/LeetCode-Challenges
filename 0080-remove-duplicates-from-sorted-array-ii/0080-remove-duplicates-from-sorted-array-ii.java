class Solution {

    public int removeDuplicates(int[] nums) {
        int count = 1; 
        int indx = 1; 
        int duplicates = 0; 
        for ( int i = 1; i < nums.length; i++ ) {
            if( nums[i] == nums[i-1] && duplicates == 0 ) {
                duplicates++; 
                count++; 
                nums[indx] = nums[i]; 
                indx++; 
            } 
            else if ( nums[i] == nums[i-1] && duplicates > 0) {
                duplicates++; 
            }
            else {
                duplicates = 0; 
                count++;
                nums[indx] = nums[i];
                indx++;  
            }
        }
        System.gc();
        return count; 
    }
}