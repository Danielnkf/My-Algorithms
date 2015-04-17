/***** Version 1 *****/

public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        
       ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
       if(rowIndex<0) return null;
       //Create the first array
       ArrayList<Integer> first = new ArrayList<Integer>();
       first.add(1);
       res.add(first);
       
       for(int i=2;i<=rowIndex+1;i++){
           ArrayList<Integer> prev = res.get(i-2); //prev (-1)and rows count from 1 (-1)
           ArrayList<Integer> next = new ArrayList<Integer>();
           next.add(1);
           for(int j=1;j<i-1;j++){ //j is array index so we need i-1 e.g
               next.add(prev.get(j-1)+prev.get(j));
               }
           next.add(1);
           res.add(next);
           
       }return res.get(rowIndex);
       
        
    }
}

/***** Version 2 *****/
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> res = new ArrayList<Integer>(), temp = new ArrayList<Integer>();
        res.add(1); //for rowIndex=0
        temp.add(1);
        temp.add(1);

        //Every loop created and store in temp
        //res erase every loop and new again and temp store prev
        //Only when rowIndex>=1 will go to for loop

        for(int i = 1; i <= rowIndex; i++) { //since k is index so 
            res = new ArrayList<Integer>();
            res.add(1);
            for(int j = 0; j <= i - 2; j++) //for rowIndex=1, it will skip 
                res.add(temp.get(j) + temp.get(j + 1));
            res.add(1);
            temp = res;
        }
        return res;
    }