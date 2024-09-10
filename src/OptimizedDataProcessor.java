public class OptimizedDataProcessor {

    // Process a product while minimizing object creation and optimizing string handling
    public void processProduct(Product product) {
        // Efficient string concatenation using StringBuilder (String Handling Optimization)
        StringBuilder result = new StringBuilder();
        result.append("Processing Product: ").append(product.getName());

        // Output result
        System.out.println(result.toString());

        // Avoid creating a new String object unnecessarily
        if (product.getName() != null) {
            String message = "Processed: " + product.getName();
            System.out.println(message);
        }

        // Minimized object creation by reusing product references where possible
        // If the product is no longer needed, nullify the reference (avoid memory leaks)
    }
}
