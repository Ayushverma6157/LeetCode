class Solution {
    public boolean isp(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){i++; j--;}
            else return false;
        }
        return true;
    }
    public void solve(String s,int i,List<List<String>> ans, List<String> curr){
        if(i==s.length()){ans.add(new ArrayList<>(curr)); return ;}
        for(int j=i;j<s.length();j++){
            String sub=s.substring(i,j+1);
            if(isp(sub)){
                curr.add(sub);
                solve(s,j+1,ans,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        solve(s,0,ans,new ArrayList<>());
        return ans;
    }
}