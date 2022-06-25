/*
69. Sqrt(x)
Easy

4054

3282

Add to List

Share
Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

 

Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 

Constraints:

0 <= x <= 231 - 1
*/

class Solution {
    public int mySqrt(int x) {
        int y = 0;
        while ((y+1)*(y+1)<=x) {
            y++;
        }
        return y;
        
    }
}

/*
Runtime: 37 ms, faster than 7.16% of Java online submissions for Sqrt(x).
Memory Usage: 41.7 MB, less than 29.32% of Java online submissions for Sqrt(x).
*/


class Solution {
    
    public int mySqrt(int x) {
        int start=1,end=x;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(mid<=x/mid){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        return end;
    }
    
}
/*
Someone else's solution https://leetcode.com/problems/sqrtx/discuss/2164243/2msororeasy-to-understand
Runtime: 1 ms, faster than 99.99% of Java online submissions for Sqrt(x).
Memory Usage: 39.1 MB, less than 99.17% of Java online submissions for Sqrt(x).
Next challenges: