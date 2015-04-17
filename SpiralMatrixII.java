public class Solution {
    public int[][] generateMatrix(int n) {
      int[][] res =new int[n][n];
      int val=1;
      int len=n;
      int x=0, y=0;
      while(len>0){
          if(len==1){ //if put res[0][0] will result [[9,2,3],[8,0,4],[7,6,5]]
          res[x][y]=val;//since len==1 has two meanings.I. n is originally 1  II.it is in the center of 
          return res; // matrix so we need coordinate of the center, so no [0][0] but [x][y]
          }
           for(int i=0; i<len-1;i++){ //print 1 and 2
               res[x][y++]=val++; 
           }
           for(int i=0; i<len-1;i++){ //print 3 and 4
             res[x++][y]=val++;  
           }
           for(int i=0; i<len-1;i++){
               res[x][y--]=val++;
           }
           for(int i=0; i<len-1;i++){
               res[x--][y]=val++;
           }
           x+=1; //start one index ahead than previous loop
           y+=1;
           len-=2; //each column or row have two sides so there are two nodes 
           
          
      }return res;
    }
}