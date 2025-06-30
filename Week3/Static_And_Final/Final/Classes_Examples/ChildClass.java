public class ChildClass extends ParentClass {
    @Override
    public void display() {
        System.out.println("Child class display method!");
    }

    public void exampleMethod(final int number) {
        number = 5;
        System.out.println("The number is: " + number);
    }
}
