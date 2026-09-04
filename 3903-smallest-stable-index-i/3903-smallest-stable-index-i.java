class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] minia= new int[nums.length];
        int mini=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<mini) mini=nums[i];
            minia[i]=mini;
        }
        int maxi=nums[0];
        int smallest=101;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxi) maxi=nums[i];
            if(maxi-minia[i]<=k) return i;
        }
        return -1;
    }
}