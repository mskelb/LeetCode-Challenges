class Solution {


    public int minIncrementForUnique(int[] nums) {

        Arrays.sort(nums); 
        int max = 0; 
        int inc = 0; 
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>(); 
        for ( int i = 0; i < nums.length; i++ ) {
            if ( !numbers.containsKey(nums[i]) ) {
                numbers.put(nums[i], 0);
                max = nums[i]; 
            }
            else {
                numbers.put(max + 1, 0);
                max = max + 1; 
                inc = inc + (max - nums[i]); 
            } 
        }
        return inc; 

    }
}