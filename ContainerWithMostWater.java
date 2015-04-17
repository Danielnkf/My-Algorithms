public class Solution {
    public int maxArea(int[] height) {
        int Area=0, low=0, high=height.length-1;
        while(low<high){ //create the loop
        Area = Math.max(Area, (high-low)*Math.min(height[high], height[low]));
        if(height[high]>height[low]) //in order to keep the higher one for next cal
        low++;
        else
        high--;
        }
        
        return Area;
    }
}