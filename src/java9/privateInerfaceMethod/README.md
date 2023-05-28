#  Private Interface Methods

Java 9 introduced a significant feature that allows more flexibility and modularity in interface design: private interface 
methods. Before Java 9, interfaces could only contain abstract methods or default methods. Private interface methods offer 
developers the ability to encapsulate shared logic among multiple default methods, leading to cleaner and easier-to-maintain code. 
We will explore the benefits of private interface methods and show examples of their use.

## Why private interface methods?

With the introduction of default methods in Java 8, interfaces gained the ability to provide default implementations for methods, 
allowing implementing classes to choose whether to use or override these implementations. However, a problem arose when 
there was a need to share logic among multiple default methods. Before Java 9, there was no direct way to do this. 
Private interface methods provide a solution to this problem by allowing encapsulation and reuse of shared logic.

## Benefits of private interface methods

The introduction of private interface methods offers several benefits:

- **Encapsulation and reuse of logic:** Private interface methods allow for grouping shared logic in one place, thus avoiding code duplication and making maintenance easier.
- **Better separation of concerns:** Private interface methods enable clear separation of shared logic from the specific implementation of default methods.
- **Increased flexibility:** Developers can now create more modular and flexible interfaces by using private interface methods to encapsulate shared logic.

## Conclusion
Private interface methods in Java 9 offer an elegant and efficient solution for sharing logic among default methods. 
This feature allows developers to create more modular and flexible interfaces, leading to cleaner and easier-to-maintain code.