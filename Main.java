public class Main {
    private String accountNumber;
    private double balance;

    public Main(String accountNumber, double Balance) {
        this.setAccountNumber(accountNumber);
        this.balance = Balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}