package Week4_GCD;

// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
     * javadoc.
     */
    public int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        } else {
            return gcd(b, Math.abs(a % b));
        }
    }
}