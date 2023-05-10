
class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indxn = n - 1; 
        int indxm = m - 1;
        int lastindex = (m + n) - 1; 
        for ( int i = (m+n)-1; i >= 0; i--) {
            if ( indxn == -1 ) {
                break; 
            }
            if ( indxm == -1 ) {
                for ( int k = 0; k < lastindex + 1; k++ ) {
                    nums1[k] = nums2[k];
                } 
                break;
            }
            else if ( nums1[indxm] > nums2[indxn] ) {
                nums1[lastindex] = nums1[indxm]; 
                lastindex--; 
                indxm--; 
            } else {
                nums1[lastindex] = nums2[indxn]; 
                lastindex--; 
                indxn--;
            }
        }   
    }
}