public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private boolean kickstandPosition;

    public Motorcycle(String make, String model, boolean hasSidecar) {
        super(make, model);  // call the constructor of the class Vehicle
        this.hasSidecar = hasSidecar;
    }

    public void hitKickStand() {
        if (this.kickstandPosition == true) {
            this.kickstandPosition = false;
            System.out.println("Kickstand moved up."); }
        else {
            this.kickstandPosition = true;
            System.out.println("Kickstand moved down."); }
    }
}