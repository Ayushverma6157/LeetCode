class Solution {
    public double solve(double x,long pow){
        if(pow==0) return 1;
        double ans=solve(x,pow/2);
        ans=ans*ans;
        if(pow%2!=0) ans=ans*x;
        return ans;
    }
    public double myPow(double x, int n) {
        if(n==0) return 1;
        long power=n;
        double ans;
        ans=solve(x,power);
        if(n<0) return 1.0/ans;
        return ans;
        
    }
}