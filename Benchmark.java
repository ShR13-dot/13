‏import java.util.*;

‏public class Data {
‏    public static int[] randomData(int n, long seed) {
‏        Random r = new Random(seed);
‏        int[] arr = new int[n];
‏        for (int i = 0; i < n; i++)
‏            arr[i] = r.nextInt(1_000_000) + 1;
‏        return arr;
    }

‏    public static int[] randomData(int n) {
‏        return randomData(n, System.currentTimeMillis());
    }

‏    public static int[] sortedData(int n) {
‏        int[] arr = new int[n];
‏        for (int i = 0; i < n; i++) arr[i] = i;
‏        return arr;
    }

‏    public static int[] reverseData(int n) {
‏        int[] arr = new int[n];
‏        for (int i = 0; i < n; i++) arr[i] = n - i;
‏        return arr;
    }

‏    public static int[] fewUnique(int n, long seed) {
‏        int[] arr = new int[n];
‏        int[] vals = {1, 2, 3, 4, 5};
‏        Random r = new Random(seed);
‏        for (int i = 0; i < n; i++)
‏            arr[i] = vals[r.nextInt(5)];
‏        return arr;
    }

‏    public static int[] fewUnique(int n) {
‏        return fewUnique(n, System.currentTimeMillis());
    }
}
