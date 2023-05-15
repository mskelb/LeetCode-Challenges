class Solution {

    public boolean isPalindrome(int x) {

        char[] chars = ("" + x).toCharArray();
        int leftIndex = chars.length-1; 
        boolean isPalindrome = true;  
        for ( int i = 0; i < chars.length/2; i++ ) {
            if ( chars[leftIndex-i] != chars[i] ) {
                isPalindrome = false; 
                break; 
            }
        }
        return isPalindrome; 
    }
}