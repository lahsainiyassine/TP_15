import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Memoizer {

    private static Function<Integer, Long> fibonacci;
    private static Function<Integer, Long> fibonacciMemoized;

    public static void main(String[] args) {
        fibonacci = n -> {
            if (n <= 1) return (long) n;
            System.out.println("Calcul de fibonacci(" + n + ")");
            return fibonacci.apply(n - 1) + fibonacci.apply(n - 2);
        };

        fibonacciMemoized = memoize(n -> {
            if (n <= 1) return (long) n;
            System.out.println("Calcul de fibonacci(" + n + ")");
            return fibonacciMemoized.apply(n - 1) + fibonacciMemoized.apply(n - 2);
        });

        System.out.println("Version non-memoized :");
        long start = System.currentTimeMillis();
        System.out.println("fibonacci(10) = " + fibonacci.apply(10));
        System.out.println("Temps: " + (System.currentTimeMillis() - start) + "ms");

        System.out.println("\nVersion memoized :");
        start = System.currentTimeMillis();
        System.out.println("fibonacci(10) = " + fibonacciMemoized.apply(10));
        System.out.println("Temps: " + (System.currentTimeMillis() - start) + "ms");

        System.out.println("\nDeuxième appel memoized :");
        start = System.currentTimeMillis();
        System.out.println("fibonacci(10) = " + fibonacciMemoized.apply(10));
        System.out.println("Temps: " + (System.currentTimeMillis() - start) + "ms");
    }

    
    public static <T, R> Function<T, R> memoize(Function<T, R> function) {
        Map<T, R> cache = new ConcurrentHashMap<>();
        return input -> cache.computeIfAbsent(input, function);
    }
}