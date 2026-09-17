class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        recsol(0,candidates,target,ans,new ArrayList<>());
        return ans;

    }
    public void recsol(int idx,int[] candidates,int target,List<List<Integer>> ans,List<Integer> row){
            if(target==0){
                ans.add(new ArrayList<>(row));
                return ;
            }
            if(idx==candidates.length) return ;
            
            for(int i=idx;i<candidates.length;i++){
                if(i>idx && candidates[i]==candidates[i-1]) continue;
                if(candidates[i]>target) break;

                row.add(candidates[i]);
                recsol(i+1,candidates,target-candidates[i],ans,row);
                row.remove(row.size()-1);
            }

    }
}