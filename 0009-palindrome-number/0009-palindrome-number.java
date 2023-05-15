class Solution {

    public boolean isPalindrome(int x) {

        char[] chars = ("" + x).toCharArray();
        int leftIndex = chars.length-1; 
        boolean isPalindrome = true;  
        for ( int i = 0; i < chars.length; i++ ) {
            if ( i >= (leftIndex-i)) {
                break; 
            }
            if ( chars[leftIndex-i] != chars[i] ) {
                isPalindrome = false; 
                break; 
            }
        }
        return isPalindrome; 
    }
}