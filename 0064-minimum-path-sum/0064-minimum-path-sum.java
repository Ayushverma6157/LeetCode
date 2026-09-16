class Solution {
    public int minPathSum(int[][] grid) {
        return minPathSum(0,0,grid,new HashMap<>());
    }
    public int minPathSum(int i,int j,int[][] grid,HashMap<List<Integer>,Integer> memo){
        if(i==grid.length-1 && j==grid[0].length-1) return grid[i][j];
        if(i>=grid.length || j>= grid[0].length) return Integer.MAX_VALUE;
        List<Integer> pos=List.of(i,j);
        if(memo.containsKey(pos)) return memo.get(pos);
        int mini=Integer.MAX_VALUE;
        mini=Math.min(minPathSum(i+1,j,grid,memo),minPathSum(i,j+1,grid,memo));
        if(mini!=Integer.MAX_VALUE) mini=mini+grid[i][j];
        memo.put(pos,mini);
        return mini;
    }
}