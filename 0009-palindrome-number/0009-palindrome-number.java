class Solution {

    public boolean isPalindrome(int x) {

        String str = String.valueOf(x);
        int leftIndex = str.length()-1; 
        boolean isPalindrome = true;  
        for ( int i = 0; i < str.length(); i++ ) {
            if ( i >= (leftIndex-i)) {
                break; 
            }
            if ( str.charAt(leftIndex-i) != str.charAt(i) ) {
                isPalindrome = false; 
                break; 
            }
        }
        return isPalindrome; 
    }
}