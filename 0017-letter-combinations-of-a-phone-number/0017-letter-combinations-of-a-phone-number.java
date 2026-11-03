class Solution {
    public void solve(String digits,String []mapped, List<String> ans, String curr,int i){
        if(i>=digits.length()){ans.add(curr); return ;}
        int dig=(digits.charAt(i)-48)-2;
        for(int itr=0;itr<mapped[dig].length();itr++) solve(digits,mapped,ans,curr+mapped[dig].charAt(itr) ,i+1);
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        String [] mapped={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits,mapped,ans,"",0);
        return ans;
    }
}