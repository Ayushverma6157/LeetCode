class Solution {
    public int myAtoi(String s) {
        int i=0;
        long ans=0L;
        int isneg=1;
        while((i<s.length()) && s.charAt(i)==' ') {i++;}
        if((i<s.length()) && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-') isneg=-1;
            i++;
        }
        while(i<s.length() && (s.charAt(i)>=48 && s.charAt(i)<=57)){
                ans=(ans*10)+(s.charAt(i)-48);
                if(isneg*ans>Integer.MAX_VALUE) return (Integer.MAX_VALUE);
                else if(isneg*ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
                i++;
        }
        return isneg*(int)ans;
    }
}