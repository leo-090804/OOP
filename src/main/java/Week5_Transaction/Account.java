package Week5_Transaction;

import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    /**
     * javadoc.
     */
    private void deposit(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance = balance + amount;
        }
        transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
    }

    /**
     * javadoc.
     */
    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance = balance - amount;
        }
        transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
    }

    /**
     * javadoc.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * javadoc.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction transaction = transitionList.get(i);
            System.out.printf("Giao dich " + (i + 1) + ": ");
            if (transaction.getOperation().equals(transaction.DEPOSIT)) {
                System.out.printf("Nap tien $%.2f. ", transaction.getAmount());
            } else if (transaction.getOperation().equals(Transaction.WITHDRAW)) {
                System.out.printf("Rut tien $%.2f. ", transaction.getAmount());
            }
            System.out.printf("So du luc nay: $%.2f.\n", transaction.getBalance());
        }
    }
}
