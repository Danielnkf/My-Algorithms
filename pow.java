public class Solution {
 public double pow(double x, int n) {
        if(n==0) return 1;//Case0 :for case n=0
        double half=pow(x, n/2); // recursive dive to n=0 (-1/2 or 1/2=0)
        if(n%2==0) return half*half; //Case 1: for case n=-4,-2,2... etc
        else if(n>0) return half*half*x;//Case 2: for case n=1,3,5,7...etc
        else return half*half/x; //Case 3: for case n=-1,-3,-5,-7...etc
    }
}

/***** Remark *****/
/* Example 1
* pow(x=2, n=10)
* 1.half=pow(2,10)=wait for 2 = 32x32=1024(Case1)
* 2.half=pow(2,5)=wait for 3 = 4x4x2=32(Case2)
* 3.half=pow(2,2)=wait for 4 = 2x2=4 (Case1)
* 4.half=pow(2,1)=wait for 5 = 1x1x2=2 (Case2)
* 5.half=pow(2,0)= 1 (Case 0)
*
* Example 2
* pow(x=2, n=-10)
* 1.half=pow(2,-10)=wait for 2 = 1/32x1/32=1/1024(Case1)
* 2.half=pow(2,-5)=wait for 3 = 1/4x1/4/2=1/32(Case3)
* 3.half=pow(2,-2)=wait for 4 = 1/2x1/2=1/4 (Case1)
* 4.half=pow(2,-1)=wait for 5 = 1x1/2=2 (Case3)
* 5.half=pow(2,0)= 1 (Case 0)
*/