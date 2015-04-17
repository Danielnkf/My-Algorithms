public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;// remember the min and max declaration
        for(int i=0; i<prices.length;i++){
            min=Math.min(min, prices[i]); //store the min in the array
            max=Math.max(max, prices[i]-min); //store the max diff cal from two items in array
        }
        return max;
    }
}