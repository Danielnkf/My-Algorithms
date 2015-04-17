public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int [2];
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        
        for(int i=0; i< numbers.length; i++){
            if(map.containsKey(target-numbers[i])) // Check if the other (partner) is in the map or not
            {
                res[0]=map.get(target-numbers[i]); // for true it is in the Map
                res[1]=i+1;
                //break;
            }else{
                map.put(numbers[i], i+1); // otherwise, put the numbers
            }
    }return res;
    }
}