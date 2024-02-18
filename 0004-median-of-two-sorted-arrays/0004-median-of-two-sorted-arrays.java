class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length = nums1.length + nums2.length;
        ArrayList<Integer> nums3 = new ArrayList<>();
        double result = 2.0; 
        int i = 0; int j = 0; int k = 0; 
        int min = 0; int max = 0;   
        
        if ( length % 2 == 0 ) {
            min = (( length / 2) - 1);
            max = length / 2;  
        } 
        else {
            min = length / 2; 
            max = length / 2;
        } 
        while ( i < nums1.length && j < nums2.length && k < (max + 1) ) {
            
            if ( nums1[i] < nums2[j] ) {
                nums3.add(nums1[i]); 
                i++; 
            }
            else {
                nums3.add(nums2[j]);
                j++;
            }
        }
        while ( i < nums1.length && k < (max + 1) ) {
            nums3.add(nums1[i]);
            i++; 
        } 
        while ( j < nums2.length && k < (max + 1) ) {
            nums3.add(nums2[j]);
            j++; 
        }
        result = ( (double)nums3.get(max) + (double)nums3.get(min) )/2;  
        return result; 
    }
}