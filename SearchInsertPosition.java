public class Solution {
    public int searchInsert(int[] A, int target) {
        int res=0;
        for (int i=0; i<A.length; i++){
            if(target<=A[i]){
            res =i;
            break;
        }
            else 
            res= A.length;
        }return res;
    }
}