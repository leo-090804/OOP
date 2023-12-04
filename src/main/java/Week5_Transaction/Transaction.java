package Week5_Transaction;

public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    /**
     * javadoc.
     */
    public static final String DEPOSIT = "deposit";
    /**
     * javadoc.
     */
    public static final String WITHDRAW = "withdraw";

    /**
     * javadoc.
     */
    public Transaction(String newOperation, double newAmount, double newBalance) {
        this.operation = newOperation;
        this.amount = newAmount;
        this.balance = newBalance;
    }

    /**
     * javadoc.
     */
    // getters
    public String getOperation() {
        return operation;
    }

    /**
     * javadoc.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * javadoc.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * javadoc.
     */
    // setters
    public void setOperation(String newOperation) {
        this.operation = newOperation;
    }

    /**
     * javadoc.
     */
    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }

    /**
     * javadoc.
     */
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}
