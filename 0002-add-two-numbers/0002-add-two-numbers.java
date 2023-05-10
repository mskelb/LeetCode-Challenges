/**
 * Definition for singly-linked list.
 * public class ListNode {
 *      int val;
 *      ListNode next;
 *      ListNode() {

 }
 *      ListNode(int val) { 
            this.val = val; 
        }
 *      ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
 * }
 */
class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode l3 = new ListNode();
        ListNode temp = l3; //initialize a pointer to l3 
        int value = 0; 

        while ( l1 != null || l2 != null || value == 1 ) { 

            if ( l1 != null ) {
                value += l1.val;
                l1 = l1.next;
            }
            if ( l2 != null ) {
                value += l2.val;
                l2 = l2.next; 
            }
            if ( value < 10 ) { 
                l3.next = new ListNode(value); 
                l3 = l3.next;
                value = 0; 
            }
            else {
                l3.next = new ListNode(value - 10);
                l3 = l3.next; 
                l3.val = value % 10; 
                value = 1; 
            }
        }
        return temp.next; 
    }
}

