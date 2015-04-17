public class Solution {
    public int uniquePaths(int m, int n) {
        if (m<1&&n<1) return 0;
        if (m>=1&&n==1) return 1; // only one column
        if (n>=1&&m==1) return 1; //only one row
        
        
        int [][]dp = new int[m][n];
        for(int i=0;i<m;i++) dp[i][0]=1;//assign numbers to the first column
        for(int j=0;j<n;j++) dp[0][j]=1;//assign numbers to the first row
      
         // for each body node, number of path = paths from top + paths from left 
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];//we count from 0 so the range is 0 to m-1 & n-1
    }
}