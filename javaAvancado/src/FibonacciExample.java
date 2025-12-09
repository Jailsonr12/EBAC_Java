public class FibonacciExample {

    // Recursive version
    public static long fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // Dynamic programming (iterative) version
    public static long fibDP(int n) {
        if (n <= 1) {
            return n;
        }
        long prev2 = 0; // F(0)
        long prev1 = 1; // F(1)
        long current = 0;
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }

    public static void main(String[] args) {
        int n = 10;

        long r1 = fibRecursive(n);
        long r2 = fibDP(n);

        System.out.println("fibRecursive(" + n + ") = " + r1);
        System.out.println("fibDP(" + n + ") = " + r2);
    }
}
