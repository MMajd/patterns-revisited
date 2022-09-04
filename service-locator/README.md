# Service Locator 
## Intent
Encapsulate the processes involved in obtaining a service with a strong abstraction layer.

**Type**

- Creational  
- Enterprise 

**Traits**

- Consumer only knows about the services  interface and the service locator not the services itself 
- Can change services through configuration, or even add new ones 
- Service locator cache services singleton by default
- Service locator knows about services either by configuration or through its initial context
- Allows parallel programming, consumer and service provider can work on the code in the same time, once they agreed on the interface


**Advantages**
- Follows SOLID principles 
    - Single Responsibility  
      - Each component can concentrate on the specific service 
    - Interface Segregation 
      - Each interface can be specific to the type of service
    - Open/Closed principle 
      - Modification in consumer of the service is not necessary when the producer change
      - Can add more services through configuration, as they follow the given interface  
    - Liskov Substitution
      - Services can be reduced to their interfaces 
    - Dependence Inversion
      - Consumer is only dependent on the services interfaces and the services locator, never the services itself 
        
- Dependency inversion
- Result in better code testability


**Consequences**

- Global 
  - Any client can access
- Availability
  - Service may not be loaded
- Failure 
  - Client must know how to handle failures
- Life Cycle 
  - Doesn't handle inherently the object/services life cycles 


**Applicability**

- When there's a need to add new services through configuration on through some context
- When services might be injected latter time 

**When to consider**

- Enterprise environment


**UML**

![Service Locator UML Diagram](./src/main/resources/uml.jpg)