class Solution {
    static final long MOD = 1_000_000_007;
    public long pow(int n,long power){
        if(power==0) return 1L;
        long ans=pow(n,power/2);
        ans=(ans*ans)% MOD;
        if(power%2!=0) ans=(ans*n)%MOD;
        return ans;
        }
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long e=pow(5,even);
        long o=pow(4,odd);
        int aka=(int)((o*e)%MOD);
        return aka;
    }
}