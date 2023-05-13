class Solution {


    public int minIncrementForUnique(int[] nums) {

        Arrays.sort(nums); 
        int max = 0; 
        int inc = 0; 
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>(); 
        int i = 0; 
        while ( i < nums.length  ) {
            if ( !numbers.containsKey(nums[i]) ) {
                numbers.put(nums[i], 0);
                max = nums[i]; 
                i++; 
            }
            else {
                numbers.put(max + 1, 0);
                max = max + 1; 
                inc = inc + (max - nums[i]); 
                i++; 
            } 
        }
        return inc; 

    }
}