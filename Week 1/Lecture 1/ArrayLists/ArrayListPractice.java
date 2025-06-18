import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        // ArrayList<Integer> myArrayList = new ArrayList<>();

        // myArrayList.add(10);
        // myArrayList.add(20);

        // System.out.println(myArrayList);

        // // // now remove an element based on an index

        // myArrayList.remove(Integer.valueOf(10));

        // System.out.println(myArrayList);


        // // let's look at multidimensional arraylists

        ArrayList<ArrayList<Integer>> multiDimensionalArrayList = new ArrayList<>();

        for (int i=0; i<3; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j=0; j<3; j++) {
                row.add((i*3) + j + 1);
            }
            multiDimensionalArrayList.add(row);
        }
        
        System.out.println(multiDimensionalArrayList);

        multiDimensionalArrayList.clear();

        System.out.println(multiDimensionalArrayList);
    }
}
