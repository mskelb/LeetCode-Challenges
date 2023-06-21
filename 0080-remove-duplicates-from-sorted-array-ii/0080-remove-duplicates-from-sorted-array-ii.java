class Solution {

    public int removeDuplicates(int[] nums) {
        int x = 2;

        for (int i = x; i < nums.length; i++) {
            if (nums[i] != nums[x - 2]) {
                nums[x++] = nums[i];
            }
        }
        System.gc();
        return x; 
    }
}