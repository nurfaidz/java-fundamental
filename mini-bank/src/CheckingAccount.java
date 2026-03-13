public class CheckingAccount extends Account{
    private double overdraftLimit;

    public CheckingAccount(String accName, Integer accNum, double balance, double overdraftLimit) {
        super(accName, accNum, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String getAccountType() {
        return "Checking";
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return false;
        }

        if (amount > balance + overdraftLimit) {
            System.out.println("OverdraftLimit! " + balance);
            return false;
        }

        balance -= amount;
        recordTransaction("OverdraftLimit!", overdraftLimit);
        return true;
    }
}
