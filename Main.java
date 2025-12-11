‏import java.util.Arrays;

‏public class Main {
‏    static int[] sizes = {1000, 10000, 50000, 100000};
‏    static long fixedSeed = 123456789L; 

‏    public static void main(String[] args) {
        
‏        for (int n : sizes) {
‏            int[] randomData = Data.randomData(n, fixedSeed);
‏            int[] sortedData = Data.sortedData(n);
‏            int[] reverseData = Data.reverseData(n);
‏            int[] fewUniqueData = Data.fewUnique(n, fixedSeed);
            
‏            int[][] datasets = {randomData, sortedData, reverseData, fewUniqueData};
‏            String[] names = {"Random", "Sorted", "Reverse", "FewUnique"};

‏            for (int k = 0; k < datasets.length; k++) {
‏                int[] originalData = datasets[k]; 
                
‏                System.out.println("\n=== Dataset: " + names[k] + " | n = " + n + " ===");

‏                measure("InsertionSort", originalData);
‏                measure("MergeSort", originalData);
‏                measure("HeapSort", originalData);
‏                measure("QuickSort", originalData);
            }
        }
    }

‏    static void measure(String algorithmName, int[] originalData) {
‏        int[] dataCopy = Arrays.copyOf(originalData, originalData.length);
        
‏        Runnable algo = () -> {
‏            switch (algorithmName) {
‏                case "InsertionSort":
‏                    InsertionSort.sort(dataCopy);
‏                    break;
‏                case "MergeSort":
‏                    MergeSort.sort(dataCopy);
‏                    break;
‏                case "HeapSort":
‏                    HeapSort.sort(dataCopy);
‏                    break;
‏                case "QuickSort":
‏                    QuickSort.sort(dataCopy);
‏                    break;
            }
        };
        
‏        double time = Benchmark.test(algo);
‏        System.out.printf("%-15s | %.2f ms\n", algorithmName, time);
    }
}
