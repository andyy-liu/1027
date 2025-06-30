public class Overloading {
    public int multiply(byte x, byte y) {
        return x * y;
    }

    public int multiply(short x, short y) {
        return x * y;
    }

    public int multiply(short x, short y) {
        return x * y;
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        byte x = 2;
        byte y = 3;
        System.out.println(o.multiply(x, y));

        short a = 1;
        short b = 2;
        System.out.println(o.multiply(a, b));
    }
}
