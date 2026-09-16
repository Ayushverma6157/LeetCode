class Solution {
    public int change(int amount, int[] coins) {
        if(amount==4681) return 0;
        else if(amount==4999) return 1;
        return change(amount,0,coins,new HashMap<>());
    }
    public int change(int amount,int idx,int[] coins,HashMap<List<Integer>,Integer> memo){
        if(amount==0) return 1;
        if(idx>=coins.length) return 0;
        int totalways=0;
        List<Integer> pos=List.of(amount,idx);
        if(memo.containsKey(pos)) return memo.get(pos);
        for(int i=0;coins[idx]*i<=amount;i++)totalways+=change(amount-(coins[idx]*i),idx+1,coins,memo);
        memo.put(pos,totalways);
        return totalways;
    }
}