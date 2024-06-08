import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class Customer {
    private String customerId;
    private String name;
    private String address;
    private List<Account> accounts;

    public Customer(String name, String address) {
        this.customerId = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    // Add a new account for the customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Remove an existing account for the customer
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}