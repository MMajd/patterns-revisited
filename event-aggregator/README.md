# Event Aggregator Pattern 
## Intent 
A system with lots of objects can lead to complexities when a client wants to subscribe to events. The client has to find and register for each object individually, if each object has multiple events then each event requires a separate subscription. An Event Aggregator acts as a single source of events for many objects. It registers for all the events of the many objects allowing clients to register with just the aggregator.

**Type** 

- Reactive


**Traits**

- Publishers only know about the event aggregator not the subscribers
- Subscribers observe the event aggregator
- Publishers and subscribers each get to hold a reference to the aggregator
- Publishers call publications methods to notify subscribers
- Subscribers call subscription methods to receive notifications

**Advantages**

- Simplify event registration by providing a single centralized store 
  * Making it easier for subscribers to discover events 
- Reduce coupling between publishers and subscribers 
  * Improve maintainability 
- Reduce friction for introducing new events 
  * Can add new events to the system, without knowing the source, that the event aggregator job
- Reduce memory management issues related to eventing


**Applicability**

- Having Many publishers, subscribers, and events
- New events added frequently 
- Building composite application 
  - apps that broken up to several modules, which are coordinating between one another 
    - Ex: Ordering app that have multiple modules such as Shipping module, Reporting module 
- Having complex screens, that could have sync between them 

**When to consider**

- When having publisher and subscribers are tightly coupled 
- When introducing new events / subscribers is difficult 
- When there's several implicit memory management issues
  - Ex: publishers have direct links to subscribers, you have to unregister manually

![Event Aggregator UML Diagram](./src/main/resources/uml.png)