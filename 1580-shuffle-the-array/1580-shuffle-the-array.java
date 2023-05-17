class Solution {

    public int[] shuffle(int[] nums, int n) {
        
        int[] nums2 = new int[n*2]; 
        int index = 0; 
        for( int i = 0; i < n; i++ ) {
            // 0,2,4,6
            nums2[index] = nums[i]; 
            //1,3,5 
            nums2[index+1] = nums[i+n];
            index = index + 2;  
                     
        }
        return nums2; 
    }
}