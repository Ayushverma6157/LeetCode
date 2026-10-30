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
        int ans=(int)((pow(5,(n+1)/2)*pow(4,n/2))%MOD);
        return ans;
    }
}