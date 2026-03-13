import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Bank bank = new Bank();

    static void main(String[] args) {
        while (true) {
            printMenu();
            System.out.println("Choose: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    transfer();
                    break;
                case "3":
                    deposit();
                    break;
                case "4":
                    withdraw();
                    break;
                case "5":
                    checkBalance();
                    break;
                case "6":
                    applyInterest();
                    break;
                case "7":
                    showHistory();
                    break;
                case "8":
                    showAllAccounts();
                    break;
                case "x":
                    scanner.close();
                    return;
            }
        }
    }

    static void printMenu() {
        System.out.println("Mini Bank");
        System.out.println("1. Add Account");
        System.out.println("2. Add Transfer");
        System.out.println("3. Add Deposit");
        System.out.println("4. Add Withdraw");
        System.out.println("5. Check Balance");
        System.out.println("6. Apply Interest");
        System.out.println("7. Show History");
        System.out.println("8. Show All Accounts");
        System.out.println("x. Exit");
    }

    static void deposit() {
        Account acc = findAccount();
        if (acc == null) { return; }
        System.out.println("Enter amount: ");

        try {
            double amountDeposit = Double.parseDouble(scanner.nextLine().trim());
            acc.deposit(amountDeposit);
            acc.showInfo();
            System.out.println("Deposit success!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount!");
        }
    }

    static void createAccount() {
        System.out.println("Enter account name: ");
        String accountName = scanner.nextLine().trim();
        System.out.println("Choose type (Saving/Checking): ");
        String type = scanner.nextLine().trim();
        System.out.println("Initial balance: ");
        try {
            double initialBalance = Double.parseDouble(scanner.nextLine().trim());
            bank.createAccount(type, accountName, initialBalance);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount");
        }
    }

    static void transfer() {
        System.out.println("From: ");
        Account from = findAccount();
        if (from == null) return;
        System.out.println("To: ");
        Account to = findAccount();
        if (to == null) return;
        System.out.println("Enter transfer amount: ");

        try {
            double amountTransfer = Double.parseDouble(scanner.nextLine().trim());
            from.transfer(amountTransfer, to);
            System.out.println("Transfer successfully! " + amountTransfer);
        } catch (Exception e) {
            System.out.println("Invalid amount!");
        }
    }

    static void withdraw() {
        Account acc = findAccount();
        if (acc == null) { return; }
        System.out.println("Enter amount: ");

        try {
            double amountWithdraw = Double.parseDouble(scanner.nextLine().trim());
            acc.withdraw(amountWithdraw);
            acc.showInfo();
            System.out.println("Withdraw success!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount!");
        }
    }

    static void checkBalance() {
        Account acc = findAccount();
        if (acc != null ) {
            System.out.println("balance: " + acc.getBalance());
        }
    }

    static void showHistory() {
        Account acc = findAccount();
        if (acc != null) { acc.showHistory();}
    }

    static Account findAccount() {
        System.out.println("Enter account number: ");
        Integer accNum = Integer.parseInt(scanner.nextLine().trim());
        Account acc = bank.findAccount(accNum);

        if (acc == null) {
            System.out.println("Account not found");
        }

        return acc;
    }

    static void showAllAccounts() {
        bank.showAccounts();
    }

    static void applyInterest() {
        Account acc = findAccount();
        if (acc instanceof SavingAccount sa) {
            sa.applyInterest();
        } else {
            System.out.println("Only saving account earn interest!");
        }
    }

}
