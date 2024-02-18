class Solution {

    public int minPartitions(String n) {
        char c[] = n.toCharArray();
        Arrays.sort(c);
        int lastIndex = n.length()-1;
        return (c[lastIndex] - '0'); 
    }
}