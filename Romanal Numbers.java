public class Solution {
    public String intToRoman(int num) {
        String [] roman = {"I","X","C","M","V","L","D"};
        int k =0;
        String sol ="";
      while (num>0){
          int x=0;
          x=num%10;
          int j=0;
          if (x>=1 && x<=3){
            for (j=1; j<=x;j++)
            sol = roman[k]+ sol;
          }
          else if (x==4){
                  sol = roman[k] +roman[k+4]+sol;
          }
          else if (x==5){
              sol = roman[k+4] + sol;
          }
          else if (x>=6 && x<=8){
              String tmp ="";
              
              for (j=6;j<=x;j++){
              tmp = tmp+ roman[k];
          }sol = roman[k+4]+tmp+sol;
          }
          else if (x==9){
              sol = roman[k]+roman[k+1]+sol;
          }
          k++;
          num/=10;
    }return sol;
    }
    
}