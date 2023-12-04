package Week4_Fraction;

// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    private int numerator;
    private int denominator;

    /**
     * javadoc.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * javadoc.
     */
    public void setNumerator(int num) {
        this.numerator = num;
    }

    /**
     * javadoc.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * javadoc.
     */
    public void setDenominator(int den) {
        if (den != 0) {
            this.denominator = den;
        } else {
            this.denominator = 1;
        }
    }

    /**
     * javadoc.
     */
    public Solution(int num, int den) {
        if (den != 0) {
            this.numerator = num;
            this.denominator = den;
        } else {
            this.numerator = 0;
            this.denominator = 1;
        }
    }

    /**
     * javadoc.
     */
    public int findgcd(int num, int den) {
        if (den == 0) {
            return Math.abs(num);
        } else {
            return findgcd(den, Math.abs(num % den));
        }
    }

    /**
     * javadoc.
     */
    public Solution reduce() {
        int gcd = findgcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
        return this;
    }

    /**
     * javadoc.
     */
    public Solution add(Solution otherFraction) {
        numerator = numerator * otherFraction.denominator + otherFraction.numerator * denominator;
        denominator = denominator * otherFraction.denominator;
        this.reduce();
        return this;
    }

    /**
     * javadoc.
     */
    public Solution subtract(Solution otherFraction) {
        numerator = numerator * otherFraction.denominator - otherFraction.numerator * denominator;
        denominator = denominator * otherFraction.denominator;
        this.reduce();
        return this;
    }

    /**
     * javadoc.
     */
    public Solution multiply(Solution otherFraction) {
        this.numerator = this.numerator * otherFraction.numerator;
        this.denominator = this.denominator * otherFraction.denominator;
        this.reduce();
        return this;
    }

    /**
     * javadoc.
     */
    public Solution divide(Solution otherFraction) {
        if (otherFraction.denominator != 0) {
            this.numerator = this.numerator * otherFraction.denominator;
            this.denominator = this.denominator * otherFraction.numerator;
            this.reduce();
            return this;
        }
        return new Solution(this.numerator, this.denominator);
    }

    /**
     * javadoc.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution otherFraction = (Solution) obj;
            if (numerator == otherFraction.numerator && numerator == 0) {
                return true;
            }
            if ((numerator / otherFraction.numerator == denominator / otherFraction.denominator)) {
                return true;
            }
        }
        return false;
    }
}
