/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode mergeNodes(ListNode head) {

        ListNode l3 = new ListNode(); 
        ListNode temp = l3; //initialize a pointer to l3 
        int value = 0; 

        while ( head.next != null ) {

            if ( head.val != 0 ) {
                value += head.val;
                head = head.next;
            } 
            else {
                l3.next = new ListNode(value);
                l3 = l3.next;
                head = head.next; 
                value = 0; 
            }
        l3.val = value;
        } 
        return temp.next;
    }
}