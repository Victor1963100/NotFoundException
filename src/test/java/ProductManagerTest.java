import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    @Test
    public void RemoveByIdBookTest() {
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Harry Potter 1", 300, "Rowling");
        Book book2 = new Book(2, "Harry Potter 2", 300, "Rowling");
        Book book3 = new Book(3, "War and Peace", 300, "RTolstoy");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        manager.removeById(2);

        Product[] actual = manager.findAll();
        Product[] expected = { book1, book3 };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void RemoveWhenProductExistTest() {
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Harry Potter 1", 300, "Rowling");
        Book book2 = new Book(2, "Harry Potter 2", 300, "Rowling");
        Book book3 = new Book(3, "War and Peace", 300, "RTolstoy");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Assertions.assertThrows(NotFoundException.class,
                () -> manager.removeById(5));
    }
}
