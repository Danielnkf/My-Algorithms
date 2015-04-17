public class Solution {
    public void solveSudoku(char[][] board) {
        if(board==null||board.length!=9||board[0].length!=9) return;
        helper(board,0,0);
    }
    
    private boolean helper (char[][] board, int i, int j){
       //first, we fill j first (i=constant, horizontal)
       //so we need to do next i when j>=9
       
        if(j>=9) return helper(board, i+1,0);//goto next i and set j=0 again
        if(i==9) return true;       //the last row index (i) is 8 since we count from 0
                                    //so when i==9, it is ended and return true to solveSudoku
        if(board[i][j]=='.'){       //filling the array
            for(int k=1;k<=9;k++){  //since we need to use k to convert and sudoku is 1 to 9
                board[i][j]=(char)('0'+k);//int to char
                if(isValid(board, i,j)){  //check if this no. safe in line (no duplicated no.)
                    if(helper(board, i,j+1)) //if ok, then next j
                    return true;
                }
                board[i][j]='.'; //back up, will jump to return false, then back to (i, j-1)
            }
        }else{ 
            return helper(board, i,j+1);//When the array is no., then go to next one 
        } //it is returning a new object but not going in so it is not recursive ?????
        
        return false; //when hit this, loop back to prev helper
    }
    
    private boolean isValid(char[][] board, int i, int j){
        for(int k=0;k<9;k++){    //check if anyone equal on the same row
            if(k!=i&&board[k][j]==board[i][j]) return false; //k!=i don't need to check itself
        }                                                    
        for(int k=0;k<9;k++){   //check if anyone equal on the same column
            if(k!=j&&board[i][k]==board[i][j]) return false;
        }
        for(int row=i/3*3;row<i/3*3+3;row++){ //i,j have three groups,   (0,1,2)(3,4,5)(6,7,8)
            for(int col=j/3*3;col<j/3*3+3;col++){ //after rounding,row/col= 0,     3,      6
                if((row!=i||col!=j)&& board[row][col]==board[i][j]) return false;
            }   //check if the forloop row/col equal either i/j
                            
        }return true; //after checking 3for-loops, no false,then return true
    }
}