public class ProductManager {
    static Repository repository;

    public ProductManager(Repository repository) {
        this.repository = repository;
    }

    public static void add(Product product) {
        repository.add(product);

    }

    public void removeById(int id) {
        repository.removeById(id);

    }

    public Product[] findAll() {
        return repository.findAll();
    }

    }
