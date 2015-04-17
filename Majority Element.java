public class Solution {
    public int majorityElement(int[] num) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int x:num){
           if(map.containsKey(x)) 
           map.put(x, map.get(x)+1); // if there is the elem, counter add 1
           else map.put(x,1); //otherwise, start from 1
        }
        for(int y:map.keySet()){    //map.keySet return the keys so no repeated keys
        if(map.get(y)>num.length/2) //find the value >n/2
        return y;
        }return -1; // have to use -1, since it is int and it is a function
    }
}