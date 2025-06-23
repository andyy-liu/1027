public class Main {
    public static void main(String[] args) {
        Manager e1 = new Manager("Caro", 0);
        try {
        e1.switchStatus();
        e1.work();
        e1.takeBreak();
        } catch (EmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }    
}