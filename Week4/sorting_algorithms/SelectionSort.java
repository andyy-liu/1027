public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        System.out.println("Unsorted array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}