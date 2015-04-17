public class Solution {
    public int findPeakElement(int[] num) {
     if(num.length==0) return 0; // nth in array
     if(num.length==1) return 0; // only one item
     if(num.length==2) return (num[0]>num[1]?0:1); //compare which is larger only 2 items
     if(num[0]>num[1]) return 0; // the first one is largest
     if(num[num.length-1]>num[num.length-2]) return num.length-1; // the last one is largest
     // above for special conditions
     int j=0;
     for(int i=0; i<num.length; i++){
         if(num[i]<num[i+1]&& num[i+1]>num[i+2]) { // find any peak in the array such that a<b>c
         j=i+1;
         break;
         
     }
     }
     return j;
    }
}