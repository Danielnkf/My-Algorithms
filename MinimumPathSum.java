public class Solution {
    public int minPathSum(int[][] grid) {
        int xLen = grid.length, yLen =grid[0].length; //select a row to cal its length
        int [][] dp = new int [xLen][yLen];
        
        for (int i=0; i<xLen; i++){ //control n (horizontal)
        for (int j=0; j<yLen; j++){ //control m (vertical)
            dp[i][j]=grid[i][j];//input every number to dp from grid
        if(i==0&&j!=0) dp[i][j]+=dp[i][j-1];//for only one column (vertical)
        if(i!=0&&j==0) dp[i][j]+=dp[i-1][j];//for only one row (horizontal)
        if(i>0&&j>0) dp[i][j]+=Math.min(dp[i][j-1],dp[i-1][j]); //choose smaller one from right or bottom & add to dp
        }
    }return dp[xLen-1][yLen-1]; //from 0 to m-1 & n-1
    }  
}