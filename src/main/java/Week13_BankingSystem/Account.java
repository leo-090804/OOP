package Week13_BankingSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList;

    public Account() {
        accountNumber = 0;
        balance = 0;
        transactionList = new ArrayList<>();
    }

    public Account(long newAccountNumber, double newBalance) {
        accountNumber = newAccountNumber;
        balance = newBalance;
        transactionList = new ArrayList<>();
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void doWithdrawing(double withdrawalAmount) throws InvalidFundingAmountException,
            InsufficientFundsException {
        if (withdrawalAmount < 0) {
            throw new InvalidFundingAmountException(withdrawalAmount);
        } else if (withdrawalAmount > balance) {
            throw new InsufficientFundsException(withdrawalAmount);
        }
        balance = balance - withdrawalAmount;
    }

    public void doDepositing(double depositAmount) throws InvalidFundingAmountException {
        if (depositAmount < 0) {
            throw new InvalidFundingAmountException(depositAmount);
        }
        balance = balance + depositAmount;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    public String getTransactionHistory() {
        StringBuilder history = new StringBuilder("Lịch sử giao dịch của tài khoản ");
        history.append(accountNumber).append(":\n");

        for (Transaction transaction : transactionList) {
            history.append(transaction.getTransactionSummary()).append("\n");
        }

        return history.toString();
    }

    public void addTransaction(Transaction newTran) {
        transactionList.add(newTran);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Account account = (Account) obj;

        return this.accountNumber == account.accountNumber;
    }
}
