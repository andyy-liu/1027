public class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Engine started for " + make + " " + model + ".");
    }

    public void drive() {
        System.out.println("Driving the " + make + " " + model + ".");
    }
}