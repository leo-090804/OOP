package Week4_PrimeNumber;

// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
     * javadoc.
     */
    public boolean isPrime(int n) {
        int cnt = 0;
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    cnt++;
                }
            }
        }
        if (cnt == 0) {
            return true;
        } else {
            return false;
        }
    }
}