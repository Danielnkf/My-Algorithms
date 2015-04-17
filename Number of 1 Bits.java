public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count =0;
        for (int i=0; i<32; i++){
            if(checkBit(n,i)!=0){ // Check nth bit is "1" or not
                count++;
            }
        }return count;
    }
    public int checkBit(int n, int i){
        return (n&(1<<i)); //Check one bit per loop
    }
}