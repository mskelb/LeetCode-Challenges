class Solution {

    public int minPartitions(String n) {
        char c[] = n.toCharArray();
        Arrays.sort(c);
        int lastIndex = n.length()-1;
        System.gc();
        return Character.getNumericValue(c[lastIndex]); 
    }
}