public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 4);
        myCar.startEngine();  // Inherited method
        myCar.openTrunk();    // Car-specific method

        Motorcycle myMotorcycle = new Motorcycle("Yamaha", "XT250", false);
        myMotorcycle.startEngine();  // Inherited method
        myMotorcycle.hitKickStand();    // Motorcycle-specific method
        myMotorcycle.hitKickStand();    // Motorcycle-specific method

        myCar.drive();
        myMotorcycle.drive();
    }
}