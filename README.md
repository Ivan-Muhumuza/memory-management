# Memory-Optimized Java Application

[loom-video-link](https://www.loom.com/share/939001cf68ee4d37af39f33236db5d43)

## Overview

This project demonstrates a memory-optimized Java application with key techniques applied to minimize object creation, optimize string handling, make efficient use of data structures, and avoid memory leaks. The application simulates basic product caching and processing while focusing on JVM memory management best practices.

## Project Structure

```
src
 ├── Main.java
 ├── OptimizedCache.java
 ├── OptimizedDataProcessor.java
 ├── Product.java
 └── StringPoolExample.java
```

### Classes and Purpose

1. **Main.java**  
   The entry point of the application that demonstrates optimized product caching, processing, and memory management techniques.

2. **OptimizedCache.java**  
   Implements an optimized cache using a `HashMap` to store and retrieve `Product` objects efficiently, minimizing memory usage.

3. **OptimizedDataProcessor.java**  
   Processes `Product` objects while showcasing string handling optimization and minimizing object creation.

4. **Product.java**  
   Represents a simple `Product` class with `id`, `name`, and `price` fields.

5. **StringPoolExample.java**  
   Demonstrates optimization in string handling using the String Pool and `StringBuilder` to reduce unnecessary object creation.

---

## Key Optimizations

### 1. Minimizing Object Creation
- Reused objects instead of creating new instances where possible (e.g., products retrieved from the cache are reused).
- Demonstrated the use of the `StringPool` for avoiding duplicate string objects.

### 2. Efficient Use of Data Structures
- Used a `HashMap` in the `OptimizedCache` to store `Product` objects with constant-time retrieval, which reduces memory and CPU overhead compared to other structures like `LinkedList`.

### 3. String Handling Optimization
- Used `StringBuilder` in the `OptimizedDataProcessor` and `StringPoolExample` to concatenate strings efficiently, avoiding the memory overhead of repeated string creation via `+`.

### 4. Avoiding Memory Leaks
- The `OptimizedCache` provides a method `clearCache()` to release references to `Product` objects after they are no longer needed, ensuring they can be garbage collected.
- Demonstrated safe object handling and reference nullification to avoid holding on to objects unnecessarily.

---

## How to Run the Project

### 1. Clone the Repository
```bash
git clone https://github.com/Ivan-Muhumuza/memory-management.git
```

### 2. Open in IntelliJ IDEA
- Open IntelliJ IDEA and import the project.

### 3. Run the Application
- You can run the application by executing `Main.java` directly from IntelliJ by clicking the **Run** button.
