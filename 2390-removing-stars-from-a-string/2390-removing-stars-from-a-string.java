class Solution {
    
    public String removeStars(String s) {
        char[] arr = s.toCharArray();
        int idx = 0;
        for(char cc : arr) {
            if(cc == '*') {
                idx = Math.max(idx - 1 , 0);
            }
            else {
                arr[idx] = cc;
                idx++;
            }
        }
        return new String(arr , 0 , idx);
    }
}