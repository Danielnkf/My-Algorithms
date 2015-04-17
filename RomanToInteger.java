public class Solution {
    public int romanToInt(String s) {
        HashMap <Character, Integer>map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res= map.get(s.charAt(s.length()-1));
        for (int i=s.length()-2; i>=0; i--){ //see below
            res+=(map.get(s.charAt(i))<map.get(s.charAt(i+1))? -1:1)*map.get(s.charAt(i));
        }return res;
    }
} 
//for迴圈的定義是for(initial; condition; loop)=>condition that for loop is running thus we need i>=0 such that i is from 7 6 ...2 1 0 while 0 is the last digit fulfill i>=0