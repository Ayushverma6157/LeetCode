class Solution {
    public int rob(int[] nums) {
        return rob(0,nums,new HashMap<>());
    }
    public int rob(int i,int[] nums,HashMap<Integer,Integer> memo){
        if(i>=nums.length) return 0;
        if(memo.containsKey(i)) return memo.get(i);
        int maxi=Integer.MIN_VALUE;
        int result=Math.max(nums[i]+rob(i+2,nums,memo),rob(i+1,nums,memo));
        memo.put(i,result);
        return result;
    }
}