import java.util.ArrayList;

public class StaticBlocks {
    static ArrayList<String> l1 = new ArrayList<>();
    static {
        l1.add("A");
        l1.add("B");
        l1.add("C");
    }

    public static void changeArrayList() {
        l1.add("1");
    }
}
