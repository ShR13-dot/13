‏import java.util.Arrays;

‏public class Benchmark {

‏    public static double test(Runnable algorithm) {
‏        long start = System.nanoTime();
‏        algorithm.run();
‏        long end = System.nanoTime();
‏        return (end - start) / 1_000_000.0;
    }

‏    public static int[] copy(int[] arr) {
‏        return Arrays.copyOf(arr, arr.length);
    }
}
