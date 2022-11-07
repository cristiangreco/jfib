package cc.regolo.jfib;

/**
 * JFib is a simple package to calculate fibonacci numbers.
 */
public class JFib {

    /**
     * Calculate fibonacci number for n.
     * @param n the input
     * @return the value
     */
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
