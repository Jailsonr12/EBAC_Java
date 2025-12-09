public class Factorial {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        // base case
        if (n == 0 || n == 1) {
            return 1L;
        }
        // recursive step
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));  // 6
        System.out.println(factorial(7));  // 5040
    }
}
