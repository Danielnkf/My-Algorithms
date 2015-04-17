public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        boolean [] isSelected = new boolean [num.length];
        if(num==null||num.length==0) return res;
        helper(num, res, cur, isSelected);
        return res;
    }
    public void helper(int[]num,ArrayList<ArrayList<Integer>> res, ArrayList<Integer> cur, boolean [] isSelected){
        if(cur.size()==num.length)
        res.add(new ArrayList<Integer> (cur)); //if not new, cur in res will be affected
        else{                                 //resulted in input=[1], output=[[]], expected=[[1]]
            for(int i=0; i<num.length;i++){
                if(isSelected[i]==false){ //if ith is selected, goto next one
                    isSelected[i]=true;
                    cur.add(num[i]);
                    helper(num, res, cur, isSelected);
                    cur.remove(cur.size()-1); //if the number is selected, then remove
                    isSelected[i]=false; // set it back to false
                }
            }
        }
    }
}