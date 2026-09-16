class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo=new int[m+1][n+1];
        for(int[] row:memo) Arrays.fill(row,-1);
        return uniquePaths(1,1,m,n,memo);
    }
    public int uniquePaths(int i,int j,int m,int n, int[][] memo){
        if(i==m && j==n) return 1;
        if(i>m || j>n) return 0;
        if(memo[i-1][j-1]!=-1) return memo[i-1][j-1];
        int total=uniquePaths(i+1,j,m,n,memo)+uniquePaths(i,j+1,m,n,memo);
        memo[i-1][j-1]=total;
        return total;
    }
}