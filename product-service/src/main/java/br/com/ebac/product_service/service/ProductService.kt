package main.java.br.com.ebac.product_service.service

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Product create(Product product) {
        product.setId(null);
        return repository.save(product);
    }

    public Product update(Long id, Product product) {
        Product existing = findById(id);
        existing.setName(product.getName());
        existing.setDescription(product.getDescription());
        existing.setPrice(product.getPrice());
        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
