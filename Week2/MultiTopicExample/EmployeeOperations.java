public interface EmployeeOperations {
    abstract void work() throws EmployeeException; // throws EmployeeException indicates that this method can throw an
                                                   // EmployeeException

    abstract void takeBreak() throws EmployeeException;

}
