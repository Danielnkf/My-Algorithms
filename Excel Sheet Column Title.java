public class Solution {
    public String convertToTitle(int n) {
      if(n<27){
          return (char)('A'+(n-1))+""; // why +"" needed??
      
      }else if(n%26==0){
          return convertToTitle(n/26-1)+'Z'; // ?? why convertToTitle needed??
      
      }else {
          return convertToTitle(n/26) +convertToTitle(n%26);
      }
    }
}