public class BankAccountTestManual {
    public static void main(String[] args) {

        testInitialBalance();
        testInitialBalanceNegative();
        testDeposit();
        testDepositNegative();
        testWithdraw();
        testWithdrawNegative();
        testWithdrawExceedsBalance();

    }

    private static boolean testInitialBalance() {
        BankAccount account = new BankAccount(100.0);
        if (account.getBalance() != 100.0) {
            System.out.println("testInitialBalance failed");
            return false;
        }
        System.out.println("testInitialBalance passed");
        return true;
    }

    private static boolean testInitialBalanceNegative() {
        try {
            new BankAccount(-100.0);
            System.out.println("testInitialBalanceNegative failed");
            return false;
        } catch (IllegalArgumentException e) {
            System.out.println("testInitialBalanceNegative passed");
            return true;
        }
    }

    private static boolean testDeposit() {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        if (account.getBalance() != 150.0) {
            System.out.println("testDeposit failed");
            return false;
        }
        System.out.println("testDeposit passed");
        return true;
    }

    private static boolean testDepositNegative() {
        BankAccount account = new BankAccount(100.0);
        try {
            account.deposit(-50.0);
            System.out.println("testDepositNegative failed");
            return false;
        } catch (IllegalArgumentException e) {
            System.out.println("testDepositNegative passed");
            return true;
        }
    }

    private static boolean testWithdraw() {
        BankAccount account = new BankAccount(100.0);
        account.withdraw(50.0);
        if (account.getBalance() != 50.0) {
            System.out.println("testWithdraw failed");
            return false;
        }
        System.out.println("testWithdraw passed");
        return true;
    }

    private static boolean testWithdrawNegative() {
        BankAccount account = new BankAccount(100.0);
        try {
            account.withdraw(-50.0);
            System.out.println("testWithdrawNegative failed");
            return false;
        } catch (IllegalArgumentException e) {
            System.out.println("testWithdrawNegative passed");
            return true;
        }
    }

    private static boolean testWithdrawExceedsBalance() {
        BankAccount account = new BankAccount(100.0);
        try {
            account.withdraw(150.0);
            System.out.println("testWithdrawExceedsBalance failed");
            return false;
        } catch (IllegalArgumentException e) {
            System.out.println("testWithdrawExceedsBalance passed");
            return true;
        }
    }
}