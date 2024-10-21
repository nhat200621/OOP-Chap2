public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        System.out.println(c1);
        System.out.println("ID: " + c1.getId());
        System.out.println("Name: " + c1.getName());
        System.out.println("Gender: " + c1.getGender());
        Account acc1 = new Account("A101", c1, 100.0);
        System.out.println(acc1);
        acc1.deposit(50);
        System.out.println("After deposit: " + acc1);
        acc1.withdraw(30);
        System.out.println("After withdrawal: " + acc1);
        acc1.withdraw(200);
        System.out.println("After insufficient withdrawal: " + acc1);
    }
}
