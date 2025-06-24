public class Manager extends Employee {

    public Manager(String name, int employeeId) {
        super(name, employeeId); // calls the constructor of the Employee class
    }

    private void manage() {
        System.out.println(name + " is managing!");
    }

    @Override
    public void work() throws EmployeeException {
        super.work(); // calls the work method of the Employee class
        manage();
    }
}
