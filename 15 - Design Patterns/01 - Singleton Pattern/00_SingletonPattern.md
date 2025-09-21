# Singleton Pattern

- The Singleton pattern ensures that a class has one instance and provides a global point of access to it.  
- This is particularly useful when exactly one object is needed to coordinate actions across the system.

## Key Characteristics

- **Private constructor** to prevent instantiation (creation & initialization).  
- **A static method** to provide access to the instance.  
- **Lazy or eager initialization** depending on when the instance is created.  
