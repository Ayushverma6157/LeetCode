class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0')
            return 0;
        if(s.length()==1 ) return 1;
        HashMap<Integer,Integer> memo=new HashMap<>();
        return numDecodings(1,Integer.parseInt(s.substring(0,1)),s,memo)+numDecodings(2,Integer.parseInt(s.substring(0,2)),s,memo);
    }

    public int numDecodings(int i, int n,String s, HashMap<Integer, Integer> memo) {
        if(n<=0 || n>26)return 0;
        if(i==s.length()) return 1;
        if(s.charAt(i)=='0') return 0;
        if(i==s.length()-1) return 1;
        if(memo.containsKey(i)) return memo.get(i);
        int result=numDecodings(i+1,Integer.parseInt(s.substring(i,i+1)),s,memo)+numDecodings(i+2,Integer.parseInt(s.substring(i,i+2)),s,memo);
        memo.put(i,result);
        return result;
    }
    
}