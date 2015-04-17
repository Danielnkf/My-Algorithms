public class Solution {
    public int maxProfit(int[] prices) {
        int i;
        int sol=0;
        for(i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
              sol+=prices[i]-prices[i-1];
            }
        }return sol;
    }
}