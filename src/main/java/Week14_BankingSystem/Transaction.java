package Week14_BankingSystem;

public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 11;
    public static final int TYPE_DEPOSIT_SAVINGS = 12;
    public static final int TYPE_WITHDRAW_CHECKING = 21;
    public static final int TYPE_WITHDRAW_SAVINGS = 22;
    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    public Transaction(int newType, double newAmount, double newInitialBalance,
                       double newFinalBalance) {
        type = newType;
        amount = newAmount;
        initialBalance = newInitialBalance;
        finalBalance = newFinalBalance;
    }

    public String getTransactionTypeString(int newType) {
        switch (newType) {
            case TYPE_DEPOSIT_CHECKING:
                return "Nạp tiền vãng lai";
            case TYPE_DEPOSIT_SAVINGS:
                return "Nạp tiền tiết kiệm";
            case TYPE_WITHDRAW_CHECKING:
                return "Rút tiền vãng lai";
            case TYPE_WITHDRAW_SAVINGS:
                return "Rút tiền tiết kiệm";
            default:
                return "Biết chết liền";
        }
    }

    public String getTransactionSummary() {
        String newTranType = getTransactionTypeString(type);
        return String.format("- Kiểu giao dịch: %s. Số dư ban đầu: $%.2f. Số tiền: $%.2f. Số dư " +
                "cuối: $%.2f.", newTranType, initialBalance, amount, finalBalance);
    }
}
