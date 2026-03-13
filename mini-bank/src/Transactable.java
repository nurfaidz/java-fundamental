public interface Transactable {
    boolean deposit(double amount);
    boolean withdraw(double amount);
    boolean transfer(double amount, Account target);
}
