public class Solution {
    public int singleNumber(int[] A) {
        HashMap<Integer, Integer> map = new HashMap <Integer, Integer>();
        for (int i=0; i<A.length;i++){
            map.put(A[i], map.containsKey(A[i])?map.get(A[i])+1:1);
        }
        int j=0;
        while(map.get(A[j])==3)
        j++;
        return A[j];
    }
}