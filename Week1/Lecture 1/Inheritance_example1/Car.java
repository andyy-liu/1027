public class Car extends Vehicle {
    private int doors;

    public Car(String make, String model, int doors) {
        super(make, model); // calling the constructor of the class Vehicle
        this.doors = doors;
    }

    public void openTrunk() {
        System.out.println("Trunk opened.");
    }
}