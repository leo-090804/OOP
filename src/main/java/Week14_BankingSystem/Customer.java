package Week14_BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList;

    public Customer() {
        idNumber = 0;
        fullName = "";
        accountList = new ArrayList<>();
    }

    public Customer(long newIdNumber, String newFullname) {
        idNumber = newIdNumber;
        fullName = newFullname;
        accountList = new ArrayList<>();
    }

    public String getCustomerInfo() {
        return "Số CMND: " + idNumber + ". Họ tên: " + fullName + ".";
    }

    public void addAccount(Account newAccount) {
        accountList.add(newAccount);
    }

    public void removeAccount(Account deleteAccount) {
        accountList.remove(deleteAccount);
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
