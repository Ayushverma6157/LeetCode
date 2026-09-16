class Solution {
    public boolean canPartition(int[] nums) {
        int tsum=0;
        for(int num:nums) tsum+=num;
        if(tsum%2!=0) return false;
        Boolean[][] memo=new Boolean[nums.length+1][(tsum/2)+1];
        return canPartition(0,tsum/2,nums,memo);
    }
    public boolean canPartition(int i,int target,int[] nums, Boolean[][] memo){
        if(target==0) return true;
        if(i>=nums.length || target<0) return false;
        if(memo[i][target]!=null) return memo[i][target];
        Boolean posi= canPartition(i+1,target-nums[i],nums,memo) || canPartition(i+1,target,nums,memo);
         memo[i][target]=posi;
        return posi;
    }
}