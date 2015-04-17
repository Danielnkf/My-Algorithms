public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List <Integer> res =  new ArrayList <Integer> ();
       if(matrix==null || matrix.length==0) return res;
       int m=matrix.length;
       int n=matrix[0].length;
       int x=0, y=0;
       while(m>0&&n>0){
           if(m==1){
               for(int i=0; i<=n-1;i++) //only one row (horizontal)
               res.add(matrix[x][y++]);
               break;
           }else if(n==1){
               for(int i=0; i<=m-1;i++) //only one column (vertical)
               res.add(matrix[x++][y]);
               break;
           }
       
           for(int i=0; i<n-1;i++){ //store from m[0] to m[n-2] e.g. only store "2"
               res.add(matrix[x][y++]); //leave the last node to the next loop
           }
           for(int i=0; i<m-1;i++){ //start m[n-1]to m[m-2] e.g. start at "3" to "6"
             res.add(matrix[x++][y]);  
           }
           for(int i=0; i<n-1;i++){
               res.add(matrix[x][y--]);
           }
           for(int i=0; i<m-1;i++){
               res.add(matrix[x--][y]);
           }
           x+=1; //start one index ahead than previous loop
           y+=1;
           m-=2; //each column or row have two sides so there are two nodes 
           n-=2; //so we need to subtract 2 not 1.
          
       }return res;
    }
}