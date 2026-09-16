class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0')
            return 0;
        if(s.length()==1 ) return 1;
        HashMap<Integer,Integer> memo=new HashMap<>();
        System.out.println("Initial calls using "+Integer.parseInt(s.substring(0,1))+" and "+Integer.parseInt(s.substring(0,2)));
        return numDecodings(1,Integer.parseInt(s.substring(0,1)),s,memo)+numDecodings(2,Integer.parseInt(s.substring(0,2)),s,memo);
    }

    public int numDecodings(int i, int n,String s, HashMap<Integer, Integer> memo) {
        System.out.println("i is : "+i+" and n is "+n);
        if(n<=0 || n>26){System.out.println("n excds"); return 0;}
        if(i==s.length()) return 1;
        if(s.charAt(i)=='0') return 0;
        if(i==s.length()-1) {System.out.println("As only one remains return 1");return 1;}
        if(memo.containsKey(i)) return memo.get(i);
        int result=numDecodings(i+1,Integer.parseInt(s.substring(i,i+1)),s,memo)+numDecodings(i+2,Integer.parseInt(s.substring(i,i+2)),s,memo);
        memo.put(i,result);
        return result;
    }
    
}