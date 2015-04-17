public class Solution {
    public int[] plusOne(int[] digits) {
        int length= digits.length -1;
        int carrier = 1;
        int i=length;
        while(carrier==1 && i>=0){
            digits[i]+=carrier;
            carrier = digits[i]/10; //if value <10, return 0. if value=10, return 1;
            digits[i]%=10;
            i--;
        }
        if (carrier==1){  // for the MSB carrier out and add one more slot to the array;
            digits = new int [length+2]; // original length is "length+1", so "length+2" is adding 1 slot;
            digits[0]=1;//carry out from old digits [0] <= become new digit[1];
            
        }return digits;
    }
}