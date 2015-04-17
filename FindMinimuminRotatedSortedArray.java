public class Solution {
    public int findMin(int[] num) {
        if(num.length==0) return 0;
        if(num.length==1) return num[0]; //e.g.{1}
        if(num.length==2) return Math.min(num[0], num[1]); //e.g.{0,1}, {1,0}
        if(num[0]<num[num.length]) return num[0];//check in order cases e.g.{1,2,3}
        
        int mid=num.length/2; //find the mid point to do Bin search O(log)
        if(num[0]>num[mid]) return findMin(Arrays.copyOfRange(num,0,mid+1)) ; //min is in btn 0->mid e.g.{4,5,6,0,1,2,3} 
        else return findMin(Arrays.copyOfRange(num,mid+1, num.length));// min is in btn mid+1->num.length-1
                                                                //Arrays.copyOfRange(array name, starting index, end index+1)
        
    }
}