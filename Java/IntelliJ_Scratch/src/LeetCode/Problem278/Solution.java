package LeetCode.Problem278;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lowBound = 0, highBound = n;
        while((lowBound+1)!=highBound) {
            int midpoint = lowBound + (highBound-lowBound)/2;
            if(isBadVersion(midpoint)) {
                highBound = midpoint;
            } else {
                lowBound = midpoint;
            }
        }
        return highBound;

    }
}