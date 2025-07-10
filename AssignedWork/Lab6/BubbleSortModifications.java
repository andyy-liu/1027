public class BubbleSortModifications {
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // swap if the element found is less than the next element
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // if no two elements were swapped by the inner loop, then break
            if (!swapped)
                break;
        }
    }

    public static void bubbleSortStrings(String[] arr) {
        int n = arr.length;
        boolean swapped;

        // traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // swap if the element found is greater than the next element
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // if no two elements were swapped by the inner loop, then break
            if (!swapped)
                break;
        }
    }

    public static void bubbleSortCompareArrays() {
        final int ARRAY_SIZE = 1000;

        // Generate three large random arrays
        int[] array1 = new int[ARRAY_SIZE];
        int[] array2 = new int[ARRAY_SIZE];
        int[] array3 = new int[ARRAY_SIZE];

        // Fill arrays with random values
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array1[i] = (int) (Math.random() * 10000);
            array2[i] = (int) (Math.random() * 10000);
            array3[i] = (int) (Math.random() * 10000);
        }

        // Test Array 1
        long startTime = System.nanoTime();
        bubbleSortDescending(array1.clone()); // Use clone to preserve original
        long endTime = System.nanoTime();
        long executionTime1 = endTime - startTime;
        System.out.println("Array 1 execution time: " + executionTime1 + " ns");

        // Test Array 2
        startTime = System.nanoTime();
        bubbleSortDescending(array2.clone());
        endTime = System.nanoTime();
        long executionTime2 = endTime - startTime;
        System.out.println("Array 2 execution time: " + executionTime2 + " ns");

        // Test Array 3
        startTime = System.nanoTime();
        bubbleSortDescending(array3.clone());
        endTime = System.nanoTime();
        long executionTime3 = endTime - startTime;
        System.out.println("Array 3 execution time: " + executionTime3 + " ns");
    }

    public static void main(String[] args) {
        bubbleSortCompareArrays();
    }
}
