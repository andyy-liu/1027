public class StaticVariables {
    public static int myStaticVariable = 0;

    public void changeStaticVariable(int a) {
        myStaticVariable = a;
    }

    public void printStaticVariable() {
        System.out.println(myStaticVariable);
    }
}
