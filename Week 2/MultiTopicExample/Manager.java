public class Manager extends Employee {
    
    public Manager(String name, int employeeId) {
        super(name, employeeId);
    }

    private void manage() {
        System.out.println(name + " is managing!");
    }

    @Override
    public void work() throws EmployeeException {
        super.work();
        manage();
    }
}
