package Week13_BankingSystem;

public class SavingsAccount extends Account {
    SavingsAccount(long accountNumber, double amount) {
        super(accountNumber, amount);
    }

    @Override
    public void withdraw(double amount) {
        try {
            if (amount <= 1000 && balance >= 5000) {
                doWithdrawing(amount);
                Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS, amount,
                        getBalance() + amount, getBalance());
                addTransaction(transaction);
            } else {
                throw new InvalidFundingAmountException(amount);
            }
        } catch (InvalidFundingAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deposit(double amount) {
        try {
            doDepositing(amount);
            Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS, amount,
                    getBalance() - amount, getBalance());
            addTransaction(transaction);
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
