package Week5_Transaction;

public class Main {
    public static void main(String[] args) {
        Account newAccount = new Account();
        newAccount.addTransaction(2003, "deposit");
        newAccount.printTransaction();
    }
}
