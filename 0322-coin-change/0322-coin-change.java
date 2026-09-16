class Solution {
    public int coinChange(int[] coins,int amount){
        int res=coinChange(coins,amount,new HashMap<>());
        return res==Integer.MAX_VALUE?-1:res;
    }
    public int coinChange(int[] coins, int amount,HashMap<Integer,Integer> memo) {
        if(amount==0) return 0;
        if(memo.containsKey(amount)) return memo.get(amount);
        int mini=Integer.MAX_VALUE;
        for(int num:coins){
            int remain=amount-num;
            if(remain>=0) mini=Math.min(coinChange(coins,remain,memo),mini);
        }
        if(mini==Integer.MAX_VALUE) {memo.put(amount,mini);return mini;}
        memo.put(amount,mini+1);
        return mini+1;
    }
}