import java.util.HashMap;
import java.util.Map;

public class OptimizedCache {
    // Efficient use of data structures: Using HashMap for constant time lookups
    private final Map<Integer, Product> productCache = new HashMap<>();

    // Method to add products to cache
    public void addProduct(Product product) {
        productCache.put(product.getId(), product);
    }

    // Method to get products from cache
    public Product getProduct(int id) {
        return productCache.get(id);
    }

    // Clear cache to avoid memory leaks
    public void clearCache() {
        productCache.clear();
    }
}
