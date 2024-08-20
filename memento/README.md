# Memento

## Intent

Without violation encapsulation, capture and externalize an object's internal state
so that the object can be restored to this state later.

Useful pattern for implementing undo/redo functionality in applications,
as adding the undo/redo functionality inside our classes will violate the Signle Resposibility Priniciple,
also to hide the internal state of our objects this would violate encapsolution, that's why Memento is useful in such cases

**Type**

- Structural
- GOF

**Traits**

- Need a placeholder for an actual object that's expensive to create
- Adding a spectial logic such as Spring proxies that's used transactional methods in a db trasaction

**Advantages**

- Solid Principles
  - Open/Closed principles
- Permformance improvements / Lazy loading

**Applicability**

- Remote proxy acts as a local representative of a remote object, and abstracts away the details of communcating with remote object
- Virtual proxy creates a expensive object on demand
- Protection proxy can be used to control acess to an object, based on autherization rules

- **When to consider**

- Lazy loading
- Performance improvements
- Abstracting logic around task such as transactions in db or network commnication in case remote proxy

**Alternative approach**

**UML**

![Memento UML Diagram 1](./src/main/resources/uml.jpg)
