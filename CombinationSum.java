public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>> ();
        ArrayList<Integer> tmp = new ArrayList<Integer> ();
        
        if (candidates.length ==0||candidates==null) return res;
        Arrays.sort(candidates);
        helper(candidates, target, 0,tmp, res);
        return res;
    }
    public void helper(int[] can, int target, int start, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res){
        ArrayList<Integer> cur = new ArrayList<Integer>(temp);//cur is new arraylist base on (taking) values in temp
        if(target==0) {// if target==0, cur is one of answer,add to res & return it
        res.add(cur); //avoid cur.remove it when it jume back to previous loop
        return;
        }
        if(target<0)//prev can[i] is too big, return to loop and use cur.remove to remove this item
        return;
        
        for(int i=start; i<can.length;i++){
           // if(i>0&&can[i]==can[i-1]) continue; //not required
            
            cur.add(can[i]); // add the no. first no matter suitable or not
            helper(can, target-can[i], i,cur, res);
            cur.remove(cur.size()-1);// remove unwants no. from prev. helper 
        }
        
    }
}