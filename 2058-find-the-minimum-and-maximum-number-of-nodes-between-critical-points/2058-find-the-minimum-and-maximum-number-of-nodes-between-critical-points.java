class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next==null) return new int[]{-1,-1};
        int firstcp=-1,lastcp=-1,currentcp=-1,mindist=Integer.MAX_VALUE,cc=1;
        ListNode prev=head,curr=prev.next,agla=curr.next;
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