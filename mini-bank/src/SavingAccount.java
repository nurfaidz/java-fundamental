public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accName, Integer accNum, double balance, double interestRate) {
        super(accName, accNum, balance);
        this.interestRate = interestRate;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient fund balance: " + getBalance());
            return false;
        }

        balance -= amount;
        recordTransaction("Withdraw", amount);
        System.out.println("Withdraw success: " + amount + " | balance: " + balance);
        return true;
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        recordTransaction("Interest", interest);
        System.out.println("Having interest to balance");
    }

    @Override
    public String getAccountType() {
        return "Saving";
    }
}
