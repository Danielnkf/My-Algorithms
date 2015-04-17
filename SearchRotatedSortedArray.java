public class Solution {
    public int search(int[] A, int target) {
        if(A.length==0) return-1;
        int start =0;
        int end = A.length-1;
        /*
          Array 1: 5 6 7 8 9 1 2 3
                   ^     ^       ^
                   |     |       |
                   S     M       E
           M>Target
          Case 1:Find 2=>A[S]>A[E], A[M]>A[E], Target<=A[E] ; SE,ME,TE
          Case 2:Find 7=>A[S]>A[E], A[M]>A[E], Target>A[E]
           
          Array 2:7 8 9 1 2 3 5 6
                  ^     ^       ^
                  |     |       |
                  S     M       E
            M<Target
          Case 3:Find 8=>A[S]>A[E], A[M]<A[E], Target=>A[E]
          Case 4:Find 2=>A[S]>A[E], A[M]<A[E], Target<A[E]
          
          Conclusion: Only M<Target or M>Target
                    and    Target>E or Target<E
        */
        while (start<=end){
            int mid=(start+end)/2;
          
            if(A[mid]>target) {
                if(A[start]>A[end]&&target<=A[end]&&A[mid]>A[end])//S>E, T<E, M<E
                start = mid+1;
                else 
                end = mid-1;
            
            }else if (A[mid]<target){
                 if(A[start]>A[end]&&target>A[end]&&A[mid]<A[end])
                 end = mid-1; //if not doing this, unrotated array will return -1
                 else         //e.g. {1,3}3 return -1
                 start = mid+1;
            }else
                return mid;
        }return -1;
    }
}