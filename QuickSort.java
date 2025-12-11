‏import java.util.Random;

‏public class QuickSort {

‏    static Random rand = new Random();

‏    public static void sort(int[] arr) {
‏        quickSort(arr, 0, arr.length - 1);
    }

‏    private static void quickSort(int[] arr, int low, int high) {
‏        if (low >= high) return;

‏        if (high - low < 16) {
‏            insertionSort(arr, low, high);
‏            return;
        }

‏        int randomIndex = low + rand.nextInt(high - low + 1);
‏        swap(arr, low, randomIndex);
‏        int pivot = arr[low];

‏        int lt = low;    
‏        int gt = high;    
‏        int i = low + 1;  

‏        while (i <= gt) {
‏            if (arr[i] < pivot) {
‏                swap(arr, lt, i);
‏                lt++;
‏                i++;
‏            } else if (arr[i] > pivot) {
‏                swap(arr, i, gt);
‏                gt--;
‏            } else {
‏                i++;
            }
        }

‏        quickSort(arr, low, lt - 1);
‏        quickSort(arr, gt + 1, high);
    }

‏    private static void swap(int[] arr, int i, int j) {
‏        int temp = arr[i];
‏        arr[i] = arr[j];
‏        arr[j] = temp;
    }

‏    private static void insertionSort(int[] arr, int low, int high) {
‏        for (int i = low + 1; i <= high; i++) {
‏            int key = arr[i];
‏            int j = i - 1;
‏            while (j >= low && arr[j] > key) {
‏                arr[j + 1] = arr[j];
‏                j--;
            }
‏            arr[j + 1] = key;
        }
    }
}
