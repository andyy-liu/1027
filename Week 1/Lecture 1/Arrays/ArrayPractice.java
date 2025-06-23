import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        // int[] numbers = new int[5];

        // System.out.println(Arrays.toString(numbers));

        // numbers[0] = 10;
        // numbers[1] = 20;

        // System.out.println(Arrays.toString(numbers));

        // int[] numbers2 = { 10, 20, 30, 40, 50 };

        // we can also modify values that have already been set
        // numbers2[3] = 100;

        // System.out.println(Arrays.toString(numbers2));

        // Arrays.sort(numbers2); // sort numbers2
        // System.out.println(Arrays.toString(numbers2));

        // multi-dimensional arrays
        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;

        System.out.println(Arrays.deepToString(matrix)); // we need to use the Arrays
        // method 'deepToString' to print the arrays within the outer array

        int[][] matrix2 = { { 1, 2 }, { 3, 4 } };
        System.out.println(Arrays.deepToString(matrix2));

    }
}
