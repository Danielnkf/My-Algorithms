public class Solution {
    public int maxSubArray(int[] A) {
        int max= Integer.MIN_VALUE, tempMax=0; //Array may contain -ve, so use MIN_VALUE
        for (int i=0; i<A.length;i++){
            tempMax+=A[i]; //Adding numbers in an array
            if(tempMax>max){ //if the sum is larger than max,
                max=tempMax; //replace max with tempMax
            }
            if(tempMax<0){
                tempMax=0; //if the sum is <0, restart the sum again
            }
            
        }return max;
    }
}