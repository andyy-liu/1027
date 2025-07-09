public class QuickSort {
    // partition the array on the basis of pivot element
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // pivot element
        int i = (low - 1); // index of smaller element

        for (int j = low; j < high; j++) {
            // if current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // method that implements QuickSort
    // arr[] --> Array to be sorted,
    // low  --> Starting index,
    // high  --> Ending index
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // int[] arr = {10, 7, 8, 9, 1, 5};
        int[] arr = {5, 3, 8, 4, 2};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}