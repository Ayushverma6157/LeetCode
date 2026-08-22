class Solution {
    public boolean checkDivisibility(int n) {
        long pro=1;
        int sum=0;
        int temp=n;
        while(temp!=0){
            pro*=temp%10;
            sum+=temp%10;
            temp/=10;
        }
        return n%(sum+pro)==0;
    }
}