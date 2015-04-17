public class Solution {
    public int numTrees(int n) {
        int num =0;
        if(n==0||n==1){
            return 1;
        }
        for (int i=0;i<n;i++){
            num += numTrees(i)*numTrees(n-i-1);
        }
        return num
    }
}