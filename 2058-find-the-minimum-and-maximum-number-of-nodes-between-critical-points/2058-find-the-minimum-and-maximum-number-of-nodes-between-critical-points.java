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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next==null) return new int[]{-1,-1};
        int firstcp=-1;
        int lastcp=-1;
        int currentcp=-1;
        int mindist=Integer.MAX_VALUE;
        int cc=1;
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode agla=head.next.next;
        while(agla!=null){
            if((prev.val>curr.val && agla.val>curr.val) || (prev.val<curr.val && agla.val<curr.val)){
                if(firstcp==-1) firstcp=cc;
                currentcp=cc;
                if(lastcp!=-1) mindist=Math.min(mindist,currentcp-lastcp);
                lastcp=currentcp;
            }
            prev=prev.next;
            curr=curr.next;
            agla=agla.next;
            cc++;
        }
        if(mindist==Integer.MAX_VALUE) return new int[]{-1,-1};
        return new int[]{mindist,currentcp-firstcp};
    } 
}