public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        if(num==null ||num.length==0) return res;
        Arrays.sort(num);
        helper(num, target, 0, temp, res);
        return res;
    }
    public void helper(int[] num, int target, int start,ArrayList<Integer> tmp, ArrayList<ArrayList<Integer>> res){
        ArrayList<Integer> cur = new ArrayList<Integer>(tmp);
        if(target==0){
            res.add(cur);
            return;
        }
        if(target<0) 
        return;
        
        for(int i=start; i<num.length; i++){
            if(i>start&&num[i]==num[i-1]) continue;
            // 如果上一轮循环没有选nums[i]，则本次循环就不能再选nums[i]，
            // 确保nums[i]最多只用一次
            // My opinion: if statement works only the first helper statement return and forloop = start+1 
            // if num[i-1]=num[i] and the num[i-1] chosen , n[i] can choose
            cur.add(num[i]);
            helper(num, target-num[i], i+1, cur, res);
            cur.remove(cur.size()-1);
        }
    }
}