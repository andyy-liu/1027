interface a {
    void methodA();
}

interface B extends a {
    void methodB();
}

class Test implements B {
    public void methodA() {
        System.out.println("Method A implemented");
    }

    public void methodB() {
        System.out.println("Method B implemented");
    }
}

public class Main {
    public static void main(String[] args) {
        B test = new Test();
        test.methodB();
    }
}