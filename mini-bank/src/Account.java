import java.util.ArrayList;
import java.util.List;

public abstract class Account implements Transactable {
    private String accountName;
    private Integer accountNumber;
    protected double balance; // protected -> can use it in another class if he extends this class
    private List<Transaction> history;

    public Account(String accountName, Integer accountNumber, double initialBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.history = new ArrayList<>();
    }

    public abstract String getAccountType();

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Must be a positive");
            return false;
        }

        balance += amount;
        recordTransaction("Deposit", amount);
        System.out.println("Success deposit!");
        return true;
    }

    public boolean transfer(double amount, Account target) {
        System.out.println("Transferring " + amount + " to: " + target.getAccountName());
        if (withdraw(amount)) {
            target.deposit(amount);
            recordTransaction("transfer", amount);
            return true;
        }
        return false;
    }

    protected void recordTransaction(String type, double amount) {
        history.add(new Transaction(type, amount, balance));
    }

    public void showHistory() {
        System.out.println("Transaction history: " + accountName);
        if (history.isEmpty()) {
            System.out.println("No Transaction History");
        }
        for (Transaction t : history) {
            System.out.println(t);
        }
    }

    public void showInfo() {
        System.out.printf("%-10s | %-15s | %-10s | Balance: %.2f%n",
                accountNumber, accountName, getAccountType(), balance);
    }

    public String getAccountName() {
        return accountName;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
