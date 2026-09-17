class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        recsol(0, candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void recsol(int idx,int[] candidates,int target,List<List<Integer>> ans, List<Integer> row){
        if(target==0){
            ans.add(new ArrayList<>(row));
            return ;
        }
        if(idx==candidates.length) return ;
        int val=candidates[idx];
        for(int i=0;i*val<=target;i++){
            int remain=target-(i*val);
            for(int j=0;j<i;j++) row.add(val);
            recsol(idx+1,candidates,remain,ans,row);
            for(int j=0;j<i;j++) row.remove(row.size()-1);
        }
    }
}