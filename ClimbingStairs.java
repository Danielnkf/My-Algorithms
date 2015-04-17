public class Solution {
    public int climbStairs(int n) {
      if (n==0||n==1||n==2) return n;//for initial cases n=0,1,2
      
      int [] dp=new int [n+1]; // since we walk from 0 to n so n+1 steps max
      dp[0]=0;
      dp[1]=1;
      dp[2]=2;
      for (int i=3; i<n+1;i++){ // first three special cases on above so start at 3
          dp[i]=dp[i-1]+dp[i-2]; //Total ways = # one step to n+ #two steps to n 
      }
      return dp[n]; //n is the last step 
    }
}