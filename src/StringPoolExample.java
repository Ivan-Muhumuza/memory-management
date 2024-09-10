public class StringPoolExample {

    // Demonstrates the optimization of string handling
    public static void optimizeStringHandling() {
        // Use string literals (which are stored in the string pool) instead of creating new objects
        String str1 = "Optimized";
        String str2 = "Optimized";

        // Strings str1 and str2 point to the same memory location in the string pool, but their values should be compared using .equals()
        System.out.println("String Value Comparison (Should be true): " + str1.equals(str2));

        // Minimizing string concatenation inefficiencies using StringBuilder
        StringBuilder optimizedString = new StringBuilder();
        optimizedString.append("Memory ").append("Optimized ").append("Application");
        System.out.println("Optimized String: " + optimizedString.toString());
    }
}
