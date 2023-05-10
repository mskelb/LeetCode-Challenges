class Solution {
    public int diagonalSum(int[][] mat) {

        int index = mat.length-1; 
        int sum = 0; 
        if ( mat.length != 0 ) {
            for(int i = 0; i < mat.length; i++ ) {
                if ( (i+i) != (i+index) ) {
                    sum = sum + mat[i][index] + mat[i][i];  
                    index--;
                } else {
                    sum = sum + mat[i][i];
                    index--;
                }
            }
        }
        return sum; 
    }
}