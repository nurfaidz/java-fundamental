import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    private int nextAccNum = 1001;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public Account createAccount(String type, String accName, double initialBalance) {
        Integer accNum = nextAccNum++;
        Account acc;

        if (type.equalsIgnoreCase("saving")) {
            acc = new SavingAccount(accName, accNum, initialBalance, 0.05);
        } else if (type.equalsIgnoreCase("checking")) {
            acc = new CheckingAccount(accName, accNum, initialBalance, 500);
        } else {
            System.out.println("Type is invalid");
            return null;
        }

        accounts.add(acc);
        System.out.println("Successfully create bank account!");
        return acc;
    }

    public Account findAccount(Integer accNum) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNum)) {
                System.out.println("Find Account Bank");
                return acc;
            }
        }

        return null;
    }

    public void showAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No Accounts");
            return;
        }

        System.out.println("Successfully retrieved data bank accounts");
        for (Account acc : accounts) {
            acc.showInfo();
        }
    }
}
