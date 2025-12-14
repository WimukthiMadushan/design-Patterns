# Design Patterns

Design patterns are commonly grouped into three main categories based on the primary problem they solve. These categories were defined by the Gang of Four (GoF) in their seminal book, *Design Patterns: Elements of Reusable Object-Oriented Software*.

---

### 01.  Creational Design Patterns
**Object Creation Related**

**What problem do they solve?**
They deal with **how objects are created**, hiding the creation logic and making the system independent of how objects are instantiated. Instead of creating objects directly using `new`, creation is controlled and optimized.

**Key Idea**
Control object creation to improve flexibility and reuse.

* **Singleton**
* **Factory Method**
* **Abstract Factory**
* **Builder**
* **Prototype**

When to Use

✔ When object creation is complex

✔ When you want to control the number of objects (e.g., ensuring only one instance exists)

✔ When creation logic should be hidden from the client


### 02. Structural Design Patterns
**Class and object composition related**

**Key idea**
Organize relationships between objects.

* **Adapter**
* **Decorator**
* **Facade**
* **Composite**
* **Bridge**
* **Proxy**
* **Flyweight**

When to Use

✔ When integrating incompatible interfaces (Adapter)

✔ When simplifying complex systems with a single entry point (Facade)

✔ When adding functionality to an object dynamically (Decorator)


### 03. Behavioral Design Patterns.
**Object interaction and communication related**

**Key Idea** 
Define clear communication and collaboration patterns between objects.
* **Observer**
* **Strategy**
* **Command**
* **Iterator**
* **State**
* **Mediator**
* **Chain of Responsibility**
* **Template Method**
* **Visitor**

When to Use

✔ When behavior (algorithm) changes at runtime (Strategy)

✔ When multiple objects need coordination upon a state change (Observer)

✔ When reducing tight coupling between objects (Mediator, Command)


























