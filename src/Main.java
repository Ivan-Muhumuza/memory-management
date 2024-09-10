public class Main {
    public static void main(String[] args) {
        // Initialize Product Cache
        OptimizedCache cache = new OptimizedCache();

        // Add products to cache
        cache.addProduct(new Product(1, "Laptop", 1200));
        cache.addProduct(new Product(2, "Phone", 800));

        // Minimize object creation: Reuse products instead of creating new ones
        Product laptop = cache.getProduct(1);
        Product phone = cache.getProduct(2);

        // Check if the products exist before processing
        OptimizedDataProcessor processor = new OptimizedDataProcessor();
        if (laptop != null) {
            processor.processProduct(laptop);
        }

        if (phone != null) {
            processor.processProduct(phone);
        }

        // String Handling Optimization Example
        StringPoolExample.optimizeStringHandling();

        // Clear the cache to avoid memory leaks after use
        cache.clearCache();

        // Run Garbage Collector to clear unused objects
        System.gc();
    }
}
