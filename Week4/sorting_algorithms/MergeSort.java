public class MergeSort {
    // merge two subarrays arr[l..m] and arr[m+1..r]
    public static void merge(int[] arr, int l, int m, int r) {
        // find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy data to temporary arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // merge the temporary arrays

        // initial indexes of first and second subarrays
        int i = 0, j = 0;

        // initial index of merged subarray
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // main function that sorts arr[l..r] using merge()
    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            // find the middle point
            int m = l + (r - l) / 2;

            // sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array:");
        printArray(arr);

        sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}