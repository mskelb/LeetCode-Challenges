import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    
    public int sumOfUnique(int[] nums) {
        
        int sum = 0; 
        // Sort the array: O(log n)
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        int length = nums.length; 
        for (int i = 0; i < length; i++ ) {
            if ( !numbers.containsKey(nums[i]) ) {
                numbers.put(nums[i], 0);
            } else {
                numbers.replace(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if ( entry.getValue() == 0 ) {
                 sum = sum + entry.getKey(); 
            }
        }
        
     return sum;   
    } 
}

