package Week13_BankingSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bank {
    private List<Customer> customerList;

    public Bank() {
        this.customerList = new ArrayList<>();
    }

    public void readCustomerList(InputStream inputStream) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String info;
            Customer customer = null;

            while ((info = reader.readLine()) != null) {
                if (Character.isDigit(info.charAt(0))) {
                    String[] accDetail = info.split("\\s+");

                    long accNum = Long.parseLong(accDetail[0]);
                    String accType = accDetail[1];
                    double balance = Double.parseDouble(accDetail[2]);

                    if (Account.CHECKING.equals(accType)) {
                        customer.addAccount(new CheckingAccount(accNum, balance));

                    } else if (Account.SAVINGS.equals(accType)) {
                        customer.addAccount(new SavingsAccount(accNum, balance));
                    }

                } else {
                    if (customer != null) {
                        customerList.add(customer);
                    }

                    String[] customerDetail = info.split("\\s+");

                    long idNumber = Long.parseLong(customerDetail[customerDetail.length - 1]);
                    String fullName = String.join(" ", customerDetail);
                    fullName = fullName.substring(0, fullName.lastIndexOf(" "));

                    customer = new Customer(idNumber, fullName);
                }
            }

            if (customer != null) {
                customerList.add(customer);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public String getCustomersInfoByNameOrder() {
        StringBuilder output = new StringBuilder();
        customerList.sort(Comparator.comparing(Customer::getFullName));

        for (Customer customer : customerList) {
            output.append(customer.getCustomerInfo()).append("\n");
        }
        return output.toString();
    }

    public String getCustomersInfoByIdOrder() {
        StringBuilder output = new StringBuilder();
        customerList.sort(Comparator.comparingDouble(Customer::getIdNumber));

        for (Customer customer : customerList) {
            output.append(customer.getCustomerInfo()).append("\n");
        }
        return output.toString();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
