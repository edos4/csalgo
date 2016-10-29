public class Fibonacci {
    public static long fibonacci(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String args[]) {
        long before = System.currentTimeMillis();
        System.out.println("30th Fib: " + fibonacci(30));
        long after = System.currentTimeMillis();
        System.out.println("Time taken(ms): " + (after - before));
    }
}
