public class StaticFinalExample {
    final int instanceVar;
    static final int CONSTANT_VAR = 50;

    StaticFinalExample(int value) {
        this.instanceVar = value; // initialize final instance variable in constructor
    }

    public void display() {
        // instanceVar = 10; // this will cause a compile-time error
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Constant Variable: " + CONSTANT_VAR);
    }

    public static void main(String[] args) {
        StaticFinalExample obj1 = new StaticFinalExample(5);
        StaticFinalExample obj2 = new StaticFinalExample(10);

        obj1.display();
        obj2.display();
    }
}
