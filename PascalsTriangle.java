public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
       
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(numRows <= 0)
            return res;
        /***** Creating the first row which contains only "1" *****/
        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(1); //add "1" to first array
        res.add(first); // add array first to solution
        
        /***** Creating for the rest since second row to nth row *****/
         //get the previous array from solution array
            //since nth count from 1 but array count from 0, this make -1
            //we want prev array, this make another -1
            //for prev is i-1-1=i-2
            
        for(int i = 2; i <= numRows; i++) { //i need to do to nth rows so i<=numRows
            ArrayList<Integer> prev = res.get(i - 2); 
            ArrayList<Integer> next = new ArrayList<Integer>();
            next.add(1); //The answer start e.g. 1st "1" in {1 4 6 4 1}
            for(int j = 1; j < i - 1; j++) //j=array index and i=nth rows, so we need j<=i-2
                next.add(prev.get(j - 1) + prev.get(j));
            next.add(1);//The answer end e.g. last "1" in {1 4 6 4 1}
            res.add(next);
        }
        return res;
    }
}
 