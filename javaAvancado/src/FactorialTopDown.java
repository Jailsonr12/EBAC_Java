public class FactorialTopDown {

    private static long[] memo;

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        memo = new long[n + 1];
        return factorialMemo(n);
    }

    private static long factorialMemo(int n) {
        if (n == 0 || n == 1) {
            return 1L;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = n * factorialMemo(n - 1);
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(factorial(7)); // 5040
    }
}
