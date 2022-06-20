package LeetCode.Problem70;

import java.math.BigInteger;

class Solution {
    public BigInteger factorial(long start, long stop) {
        if (start <= stop) {
            return new BigInteger("1");
        } else {
            return factorial(start-1, stop).multiply(BigInteger.valueOf(start));
        }
    }

    public long newPathCalc(long ones, long twos) {
        BigInteger new_paths = factorial((ones+twos),Math.max(ones, twos)).divide(factorial(Math.min(ones,
                twos),1));
        return new_paths.intValue();
    }

    public int climbStairs(int n) {
        long twos = n/2;
        long ones = n % 2;
        long count = 1; // We don't need to count the base case of all 1s separately
        long new_paths;
        while (twos>0) {
            new_paths = newPathCalc(ones,twos);
            count = count + new_paths;
            twos--;
            ones = ones + 2;
        }
        return (int) count;
    }
}

/*
For 1 Step
1. 1

For 2 Steps
1. 1+1
2. 2

For 3 Steps
1. 1+1+1
2. 1+2
3. 2+1

For 4 Steps
1. 1 + 1 + 1 + 1
2. 2 + 1 + 1
3. 1 + 2 + 1
4. 1 + 1 + 2
5. 2 + 2

For 5 Steps
1. 1+1 + ... ( 1 way)
2. 2 + 1 + 1 + 1 ( 4 ways)
6. 2 + 2 + 1 (3 ways)


For n steps
1. n lots of 1 (1 way)
2. n-2 lots of 1 and one 2 (n-1 ways)
3. n-(2*n) lots of 1 and two 2s(n-1 * n-3) / 2

Last. if even 1 way (all 2s), if odd n+1/2 ways (places to put the 1 for twos)

How many combinations of 1 and 2?
n//2 (max number of 2s)
n+1//2 (min number of digits)
n (max number of digits, all ones)
ordering of boy/girl = people! / (boy!*girl!)
ordering of 1s and 2s = (1s+2s)! / (1! + 2!)


 */
