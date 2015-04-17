
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {//how about List<List<Integer>>
    if(triangle==null||triangle.size()==0||triangle.get(0).size()==0)
    return 0;
    
    int [] res=new int [triangle.size()]; //size of last row = no. of rows in triangle
    for(int i=triangle.size()-1;i>=0;i--){ //start from last row (i = row index)
        for(int j=0; j<triangle.get(i).size();j++){ //j =index of each item in row
            if(i==triangle.size()-1) //for initial the last row to res[]
            res[j]=triangle.get(i).get(j);
            else
            res[j]=Math.min(res[j], res[j+1])+triangle.get(i).get(j);//find the smaller from two prev row       
            
        }
    }return res[0];//the top has one no. so ans store in res[0]
    }
}


/****** Not Working*****/
/*
for(int i=0; i<triangle.size();i++){
        ArrayList <Integer> temp = new ArrayList<Integer>(triangle.get(i));
        int min=Integer.MAX_VALUE;
        for(int j=1; j<trangle.get(i).size;j++){
           if(temp[i]>temp[i-1])
           min=temp[i-1];
           else continue;
        }
        min+=min;
       }return min;
*/