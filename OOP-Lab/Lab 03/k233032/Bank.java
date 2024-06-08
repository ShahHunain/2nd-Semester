import java.util.ArrayList;
import java.util.List;

class Bank{
    private List<Account> accountsList;
    private List<Customer> customersList;

    public Bank() {
        this.accountsList = new ArrayList<>();
        this.customersList = new ArrayList<>();
    }

    public void createAccount(Customer customer, String accountType) {
        Account account = new Account(accountType);
        customer.addAccount(account);
        accountsList.add(account);
    }

    public void closeAccount(Customer customer, Account account) {
        customer.removeAccount(account);
        accountsList.remove(account);
    }
}