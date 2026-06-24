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
 import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t=new ListNode(0);
        ListNode k=t;
        StringBuilder n1=new StringBuilder();
      
        while(l1!=null){
            n1.append(String.valueOf(l1.val));
            l1=l1.next;
            

        }
        n1.reverse();
       StringBuilder n2=new StringBuilder();
        while(l2!=null){
             n2.append(String.valueOf(l2.val));
            l2=l2.next;
        }
        n2.reverse();
        BigInteger a=new BigInteger(n1.toString());
        BigInteger b=new BigInteger(n2.toString());
        BigInteger c=a.add(b);
        String s=c.toString();
        for(int i=s.length()-1;i>=0;i--){
            t.next=new ListNode(s.charAt(i)-'0');
            t=t.next;
        } 
        return k.next;
    }
}