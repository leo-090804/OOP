package Week4_Fibonacci;
// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code
    /**
     * javadoc.
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        }
        long f0 = 0;
        long f1 = 1;
        long fn = f0 + f1;
        for (int i = 2; i < n; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        }
        if (n < 93) {
            return fn;
        }
        return Long.MAX_VALUE;
    }
}
