class Solution {
    public int uniquePaths(int m, int n) {
        return uniquePaths(1,1,m,n,new HashMap<>());
    }
    public int uniquePaths(int i,int j,int m,int n, HashMap<List<Integer>,Integer>memo){
        if(i==m && j==n) return 1;
        if(i>m || j>n) return 0;
        List<Integer> pos=List.of(i,j);
        if(memo.containsKey(pos)) return memo.get(pos);
        int total=uniquePaths(i+1,j,m,n,memo)+uniquePaths(i,j+1,m,n,memo);
        memo.put(pos,total);
        return total;
    }
}