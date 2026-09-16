class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:stones) pq.offer(x);
        while(pq.size()>1){
            int remain=pq.poll()-pq.poll();
            if(remain!=0) pq.offer(remain);
        }
        if(pq.size()==0) return 0;
        return pq.peek();


    }
}