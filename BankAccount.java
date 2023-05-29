public class BankAccount {
    public static void main(String[] args) {
        Main account = new Main("1234567890", 1000.0);
        double depositAmount = 500.0;
        account.deposit(depositAmount);
        System.out.println("Current balance: " + account.getBalance());
    }
}