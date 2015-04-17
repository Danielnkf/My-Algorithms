public class Solution {
    public void sortColors(int[] A) {
        int [] counter= new int[3];
        for(int i=0; i<A.length; i++){
            counter[A[i]]++; //use val in A[] to identify and add on counter array
        }
        int j=0;
        for (int i=0; i<counter[0];i++){
            A[j]=0;// A[j] can be replaced by A[j++]
            j++;  // then delete this
        }
         for (int i=0; i<counter[1];i++){
            A[j]=1;
            j++;
        }
         for (int i=0; i<counter[2];i++){
            A[j++]=2;
            //j++;
        }
    }
}