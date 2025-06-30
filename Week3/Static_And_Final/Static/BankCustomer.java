public class BankCustomer {
    private String customerName;
    private int customerId;
    static int id = 0;

    public BankCustomer(String name) {
        this.customerName = name;
        this.customerId = id;
        id += 1;
    }

    public static void printNextCustomerId() {
        System.out.println(id);
    }

    public void printBankCustomerInformation() {
        System.out.println("This customer's name is: " + this.customerName + ", and their unique ID is: " + this.customerId);
    }

    public static void main(String[] args) {
        BankCustomer c1 = new BankCustomer("A");
        BankCustomer c2 = new BankCustomer("B");
        BankCustomer.printNextCustomerId();
        c1.printBankCustomerInformation();
        c2.printBankCustomerInformation();
        BankCustomer c3 = new BankCustomer("C");
        c3.printBankCustomerInformation();

        
    }
}
