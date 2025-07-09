public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // if no two elements were swapped by the inner loop, then break
            if (!swapped) break;
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
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted array:");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
}