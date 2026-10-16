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
    public ListNode reverseKGroup(ListNode head, int k) {
        List<List<Integer>> ls=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            List<Integer> rs=new ArrayList<>();
            for(int i=0;i<k && temp!=null;i++){
                rs.add(temp.val);
                temp=temp.next;
            }
            if(rs.size()==k){
                Collections.reverse(rs);
                
            }
            ls.add(rs);

        }
       // System.out.println(ls);
        temp=new ListNode(0);
        head=temp;
        for(int i=0;i<ls.size();i++){
            for(int j=0;j<ls.get(i).size();j++){
                temp.next=new ListNode(ls.get(i).get(j));
                temp=temp.next;
            }
        }
        return head.next;
    }
}