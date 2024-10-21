public class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
        System.out.println("Book name is: " + javaDummy.getName());
        System.out.println("Price is: " + javaDummy.getPrice());
        System.out.println("Quantity is: " + javaDummy.getQty());
        System.out.println("Authors are: " + javaDummy.getAuthorNames());
        javaDummy.setPrice(29.99);
        javaDummy.setQty(50);
        System.out.println("Updated price is: " + javaDummy.getPrice());
        System.out.println("Updated quantity is: " + javaDummy.getQty());
    }
}
