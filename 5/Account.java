public class Account {
    private String id;
    private Customer customer;
    private double balance;
    public Account(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }
    public Account(String id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }
    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
        return this;
    }
    public String toString() {
        return customer.getName() + "(" + id + ") balance=$" + balance;
    }
}

