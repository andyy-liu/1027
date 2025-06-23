public class Employee implements EmployeeOperations {
    String name;
    int employeeId;
    boolean status;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void work() throws EmployeeException {
        if (status == false) {
            throw new EmployeeException(name + " is unable work work as their status is false!");
        }
        System.out.println( name + " is working!");
    }

    public void takeBreak() throws EmployeeException {
        if (status == false) {
            throw new EmployeeException(name + " is unable work work as their status is false!");
        }
        System.out.println(name + " is taking a break!");
    }

    public void switchStatus() {
        if (status == true) {
            status = false;
        } else {
            status = true;
        }
    }
    
}
