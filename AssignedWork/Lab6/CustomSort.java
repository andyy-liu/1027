import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomSort {
    /*
     * Pseudocode:
     * create 3 arrays: leftPile, rightPile, middlePile
     * for each number:
     * randomly place it into one of the 3 piles
     * sort each pile using selection sort
     * merge all three sorted piles into one array
     * use selection sort to ensure the final array is sorted
     * 
     */

    public static void customSort(int[] array) {
        List<Integer> left = new ArrayList<>();
        List<Integer> middle = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        Random rand = new Random();

        // Randomly split input into 3 buckets
        for (int num : array) {
            int r = rand.nextInt(3);
            if (r == 0)
                left.add(num);
            else if (r == 1)
                middle.add(num);
            else
                right.add(num);
        }

        // Sort each bucket with selection sort
        selectionSort(left);
        selectionSort(middle);
        selectionSort(right);

        // Merge the bins into one list
        List<Integer> merged = new ArrayList<>();
        merged.addAll(left);
        merged.addAll(middle);
        merged.addAll(right);

        // Final pass to ensure global sort
        selectionSort(merged);

        // Copy back to the original array
        for (int i = 0; i < array.length; i++) {
            array[i] = merged.get(i);
        }
    }

    // Selection sort helper
    private static void selectionSort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 6, 3, 9, 2, 7, 1, 5, 4, 8 };
        customSort(nums);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
