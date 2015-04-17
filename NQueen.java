public class Solution {
    public List<String[]> solveNQueens(int n) {
        List <String[]> res = new ArrayList <String[]>(); // String Array in ArrayList
        if(n<=0) return res;
        int []QnoInColumn = new int[n];
        helper(n, 0, QnoInColumn, res);
        return res;
    }
    public void helper (int n, int row, int [] QnoInColumn, List <String[]> res){
        if(n==row){
            String [] sol= new String [n]; // store one possible solution
            for(int i=0; i<n; i++){//i is no. of column (x-axis)
                StringBuilder q= new StringBuilder();
                for(int j=0;j<n;j++){ //j is index of Q and . (y-axis)
                if(j==QnoInColumn[i]) // if j is equal to the Q index store in QnoInColumn
                q.append("Q");
                else q.append(".");
                }
                sol[i]=q.toString();//complete one column & q add to sol
            }
            res.add(sol); // complete one possible solution & sol add to one array in res
        }else{
            for(int i=0; i<n; i++){
                QnoInColumn[row]=i;//i is possible index for Q in the row'th column, row is 1,2,3,...,n 
                if(isValid(row, QnoInColumn))//if this column is safe
                 helper(n, row+1, QnoInColumn, res);// do the next column
            }
        }
    }
    public boolean isValid(int row, int [] QnoInColumn){ //only check to row, e.g.if we are doing row=0, 
        for(int a=0; a<row;a++){                          //no other row will be check
            if(QnoInColumn[row]==QnoInColumn[a]  //check for same row (item in the same y axis along x axis)
            ||Math.abs(QnoInColumn[row]-QnoInColumn[a])==row-a) //check diagonal, Remark 1
            return false;
        }return true;
    }
}

/***** Remark 1*****/
/* 
* "row-a" never negative since row is always largest
* 
* for case"/":
* QnoInColumn[a]-QnoInColumn[row] is positive
* so we need Math.abs
* for case"\":
* QnoInColumn[row]-QnoInColumn[a] is positive
*
*/
