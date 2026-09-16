class Solution {
    public int minCostClimbingStairs(int[] cost) {
        HashMap<Integer,Integer> memo=new HashMap<>();
        return Math.min(minCostClimbingStairs(0,cost,memo),minCostClimbingStairs(1,cost,memo));
    }
    public int minCostClimbingStairs(int i,int[] cost,HashMap<Integer,Integer> memo){
        if(i==cost.length-1) return cost[i];
        if(i>=cost.length) return 0;
        if(memo.containsKey(i)) return memo.get(i);
        int result= cost[i]+Math.min(minCostClimbingStairs(i+1,cost,memo),minCostClimbingStairs(i+2,cost,memo));
        memo.put(i,result);
        return result;
    }
}