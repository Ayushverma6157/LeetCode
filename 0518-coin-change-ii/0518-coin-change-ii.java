class Solution {
    public int change(int amount, int[] coins) {
        int[][] memo=new int[amount+1][coins.length+1];
        for(int[] row:memo) Arrays.fill(row,-1);
        return change(amount,0,coins,memo);
    }
    public int change(int amount,int idx,int[] coins,int[][] memo){
        if(amount==0) return 1;
        if(idx>=coins.length) return 0;
        int totalways=0;
        if(memo[amount][idx]!=-1) return memo[amount][idx];
        for(int i=0;coins[idx]*i<=amount;i++)totalways+=change(amount-(coins[idx]*i),idx+1,coins,memo);
        memo[amount][idx]=totalways;
        return totalways;
    }
}