public class Book extends Product {

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
    }

    public Book(int id, String name, int price) {
        super(id);
    }
}
